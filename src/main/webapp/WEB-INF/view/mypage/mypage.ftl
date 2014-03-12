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
                    ${name!?html}アイランド
                </p>
            </h1>

            <div class="relative mt10">
                <div class="autoMargin w320">
                    <div class="underballoon fs14 mh10">
                        <#if (count > 0)>
                            <p>${count!?html}回プレミアムクーポンがひけるよ♪</p>
                        </#if>
                        <p class="pointArea">所持コイン：${coin!html}コイン</p>
                        <p class="pointArea">現在のポイント：${point!?html}pt</p>
                    </div>
                </div>
                <div class="mtMinus30">
                    <img src="${imagePath}/images/mypage/mypage_field.png" width="100%" class="vTop">
                </div>
                <div class="gullImage">
                    <img src="${imagePath}/images/mypage/mypage_kamome.png" width="65" height="25">
                </div>
            </div>

            <div class="mypageBtnArea mtMinus65 mh10">
                <div class="table autoMargin">
                    <div class="cell pr20">
                        <a href="${urlPath}/search" class="mypagePremierbtn jsTouchActive fs16 relative zIndex20 pt20 mv5">
                            今日<br>ドコ行く？
                        </a>
                    </div>
                    <div class="cell vTop">
                        <a href="${urlPath}/box" class="mypagePremierbtn jsTouchActive fs16 relative zIndex20 pt20 mv5">
                            クーポン<br>BOX
                        </a>
                    </div>
                </div>
            </div>

        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="mb20">
                <div class="textCenter mv10">
                    <a href="${urlPath}/static/?page=howto" class="btn btnPrimary jsTouchActive autoMargin">遊び方♪</a>
                </div>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>

</html>