<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline secondContents">
		
				
	
		<#assign aDateTime = .now>
		<#assign aDate = aDateTime?date>
		<#assign aTime = aDateTime?time>
		
        <#-- ヘッダーメニューのインクルード -->
        <#include "/common/header.ftl">
	
		<#-- ふきだしナビ -->
        <section>
            <h1 class="headline headlineNormal mt15">クーポン詳細</h1>
        </section>
	
        <section>
        	<div>
        		現在日時：${aDateTime}
        	</div>
        	<div>
        		ショップ名：${shopBean.shopName!?html}
        	</div>
        	<div>
        		クーポン名：${userCoupon.name!?html}
        	</div>
        	<div>
	        	クーポン詳細：${userCoupon.description!?html}
	        </div>
	        <div>
        		<p class="fcRed fs13">クーポン期限：${userCoupon.limitDatetime!?html}</p>
        	</div>
        	<div>
        		<p class="fcRed fs13">残り：<span id="js_remainTime">${remainTime!?html}</span></p>
        	</div>
        	
        	<#if userCoupon.status != 1>
        		<div>
        			<a id="js_useBtn">使う</a>
        		</div>
        	</#if>
        	
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mv20">
                <div class="textCenter mv10">
                    <a href="${urlPath}/search" class="btn btnPrimary jsTouchActive autoMargin">ドコ行く？TOPへ</a>
                </div>
                <div class="textCenter mv10">
                    <a href="${urlPath}/mypage" class="btn btnNormal jsTouchActive autoMargin">マイページへ</a>
                </div>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
        <script src="/coupon/js/coupon.js"></script>
        <script>
            //グローバルで使う変数を定義
            var urlPath = '${urlPath}';
            var imagePath = '${imagePath}';
            var token = '${token!?html}';
            var userCouponId = '${userCoupon.userCouponId!?html}';
        </script>
    </body>

</html>