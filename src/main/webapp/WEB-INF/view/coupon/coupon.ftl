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

        <#-- クーポン詳細 -->
        <section>
            <h1 class="headline headlineNormal mt20">${shopBean.shopName!?html}</h1>
            <div class="bgWhite borderBottomGreen relative">
                <div class="couponInfoArea">
                    <div class="pv5 ph10">
                        <h2 class="bgRoundSmall">${userCoupon.name!?html}</h2>
                        <p class="textCenter fcRed fs18 pv5">${userCoupon.description!?html}</p>
                    </div>
                </div>
                <div class="absolute" style="top: -10px; right: 2px;">
                    <img src="${imagePath}/images/coupon/srCouponImg.png" width="50">
                </div>
            </div>
            
            <div class="storeDetailText borderBox w95per m10 autoMargin">
                <h2 class="bgGray borderBottomGray fs15 p5">クーポン期限</h2>
                <p class="fs13 p5">${userCoupon.limitDatetime!?html}</p>
            </div>
            
            <div class="storeDetailText borderBox w95per m10 autoMargin">
                <h2 class="bgGray borderBottomGray fs15 p5">残り</h2>
                <p class="fs13 p5"><span id="js_remainTime">${remainTime!?html}</span></p>
            </div>
            
            <#if userCoupon.status != 1>
                <div class="textCenter mv10">
                    <a id="js_useBtn" class="btn btnSpecial jsTouchActive autoMargin">使っちゃお♪</a>
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
            
            //ftlで取得した変数を格納
            var couponDetail = window.couponDetail || {};
            
            couponDetail = {
                userCouponId : '${userCoupon.userCouponId!?html}'
            }
        </script>
    </body>

</html>