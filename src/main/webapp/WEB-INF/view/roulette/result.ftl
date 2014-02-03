<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline mypageContents">

        <#-- ヘッダーメニューのインクルード -->
        <#include "/common/header.ftl">
        
        <#-- ふきだしナビ -->
        <section>
            <h1 class="headline headlineNormal mt15">プレミアム♪ドコ行く？結果！</h1>
            <div class="autoMargin mv10 table">
                <div class="cell">
                    <img src="${imagePath}/images/saboten_normal.png" width="37" height="37" class="vBottom">
                </div>

                <div class="cell vMiddle relative pl10">
                    <div class="balloon">
                        <p><span class="fcOrange">このクーポンがあたったよ♪</span></p>
                    </div>
                </div>
            </div>
        </section>

        <section>
        
            <div class="couponResult">
                <h1 class="headline headlinePriority">${coupon.mShop.shopName!?html}</h1>
                <div class="bgWhite borderBottomOrange relative">
                        <div>
                            <img src="${imagePath}/images/storeThumnail.jpg" width="320" height="150">
                        </div>
                        <div class="couponInfoArea m5 pv5 ph10">
                            <div class="pv5">
                                <h2 class="bgRoundSmall m0auto">SRクーポン</h2>
                                <p class="textCenter fcRed fs18 pv5">${coupon.mShopCoupon.couponName!?html}</p>
                                <p class="textRight fs14 pv5"><a href="" class="link1">お店の詳細はこちら&gt;&gt;</a></p>
                            </div>
                        </div>
                    </div>
                    <div class="absolute" style="top: 5px; right: 5px;">
                        <img src="${imagePath}/images/storeThumnail.jpg" width="60" height="60">
                    </div>
            </div>
            
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="textCenter mv10">
                <a href="${urlPath}/box" class="btn btnPrimary jsTouchActive autoMargin">クーポンBOXへ</a>
            </div>
            <div class="textCenter mv20">
                <a href="${urlPath}/mypage" class="btn btnNormal jsTouchActive autoMargin">マイアイランドへ</a>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>

</html>