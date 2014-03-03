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
            <h1 class="headline headlineNormal mt20">クーポン</h1>
            <div class="bgWhite borderBottomGreen pv5 relative">
                <div class="couponInfoArea autoMargin">
                    <h2 class="textCenter underline fs18" style="padding-top: 75px;">${shopBean.shopName!?html}</h2>
                    <div class="pv5">
                        <p class="bgWhite textCenter fcRed fs18 w260 autoMargin p3">${userCoupon.name!?html}</p>
                    </div>
                    <div class="pv5">
                        <p class="textCenter fcOrange fs14">有効期限：${userCoupon.limitDatetime!?html}</p>
                    </div>
                </div>
                
                <div class="storeDetailText borderBox w95per m10 autoMargin">
                    <h2 class="bgGray borderBottomGray fs15 p5">残り期間</h2>
                    <p class="fs13 fcRed p5"><span id="js_remainTime">${remainTime!?html}</span></p>
                </div>
                
                <p class="textCenter fs12">
                    ※「使う」ボタンを押してから有効期限は24時間です。
                </p>
            </div>
            
            <#if userCoupon.status != 1>
                <div class="underballoonLight fs13 fcOrange textCenter autoMargin mt10">
                    「使う」ボタンを押すとクーポンが使えるよ♪<br>
                    そしたら、お店の人にこのページを見せてね♪
                </div>
                <div class="textCenter mv10">
                    <a id="js_useBtn" class="btn btnSpecial jsTouchActive autoMargin">このクーポンを使う♪</a>
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