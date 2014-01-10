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
                    ${loginUserDto.name!?html}アイランド
                </p>
            </h1>
            
            <div class="relative mt10">
                <div class="autoMargin w320">
                    <div class="underballoon mh10">
                        <p>1回プレミアムクーポンがひけるよ♪</p>
                        <p class="pointArea">現在のポイント：13pt</p>
                    </div>
                </div>
                <div class="mtMinus30">
                    <img src="${imagePath}/images/mypage/mypage_field.png" width="100%" class="vTop">
                </div>
                <div class="gullImage">
                    <img src="${imagePath}/images/mypage/mypage_kamome.png" width="65" height="25">
                </div>
            </div>

            <div class="mypageBtnArea mtMinus70 autoMargin">
                <div class="table autoMargin mv5">
                    <div class="cell pr20">
                        <a href="${urlPath}/coupon" class="btnSquere relative zIndex20 pt25">
                            今日ドコ行く？
                            <#--<img src="${imagePath}/images/mypage/main_btn_doko.png" width="115" height="80" class="vTop"> -->
                        </a>
                    </div>
                    <div class="cell">
                        <a href="${urlPath}/premium" class="btnSquere relative zIndex20 pt15">
                            プレミアム<br>今日ドコ行く？
                            <#-- <img src="${imagePath}/images/mypage/main_btn_premium.png" width="115" height="80" class="vTop"> -->
                        </a>
                    </div>
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