<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline mypageContents">

        <#-- ヘッダーメニューのインクルード -->
        <#include "/common/header.ftl">

        <section>
            <h1 class="textCenter relative">
                <img src="${imagePath}/images/mypage/mypage_title.png" width="100%" height="62" class="vTop">
                <p class="islandName">
                    はふてぃアイランド
                </p>
            </h1>

            <div class="table autoMargin mv5">
                <div class="cell pr20">
                    <a href="${urlPath}/coupon/coupon">
                        <div class="btnCircleBig">
                            <img src="${imagePath}/images/mypage/main_btn_doko.png" width="115" height="80" class="vTop">
                        </div>
                    </a>
                </div>
                <div class="cell">
                    <a href="${urlPath}/premium/premium">
                        <div class="btnCircleBig">
                            <img src="${imagePath}/images/mypage/main_btn_premium.png" width="115" height="80" class="vTop">
                        </div>
                    </a>
                </div>
            </div>

            <div class="relative">
                <div class="autoMargin w320">
                    <div class="underballoon mh10">
                        <p>1回プレミアムクーポンがひけるよ♪</p>
                        <p class="pointArea">現在のポイント：13pt</p>
                    </div>
                </div>
                <div style="margin-top: -30px;">
                    <img src="${imagePath}/images/mypage/mypage_field.png" width="100%" class="vTop">
                </div>
                <div class="textCenter relative" style="margin-top: -60px; z-index: 20;">
                    <a href="${urlPath}/box/box" class="btn btnNormal jsTouchActive autoMargin">クーポンBOX</a>
                </div>
                <div class="gullImage">
                    <img src="${imagePath}/images/mypage/mypage_kamome.png" width="65" height="25">
                </div>
            </div>
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="textCenter mv20">
                <a href="${urlPath}/" class="btn btnNormal jsTouchActive autoMargin">TOPへ</a>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>

</html>