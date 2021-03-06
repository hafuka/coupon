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
            <div class="mypageBg">
                <h1 class="textCenter relative pt5">
                    <img src="${imagePath}/images/mypage/title_ribbon.png" width="100%" height="30" class="vTop">
                    <p class="islandName">
                        ${name!?html}アイランド
                    </p>
                </h1>

                <div class="relative mt10">
                    <div class="autoMargin w320">
                        <div class="underballoon fs14 mh10">
                            <#if (count > 0)>
                                <p class="textCenter">${count!?html}回プレミアムスロットできるよ♪</p>
                            </#if>
                            <p class="pointArea">
                                <#-- 所持スロット券：${coin!html}枚<br> -->
                                現在のポイント：${point!?html}pt
                            </p>
                        </div>
                    </div>
                    <div class="mtMinus30">
                        <img src="${imagePath}/images/mypage/mypage_field.png" width="100%" class="vTop">
                    </div>
                    <div class="gullImage">
                        <img src="${imagePath}/images/mypage/mypage_kamome.png" width="65" height="25">
                    </div>
                </div>
            </div>

            <div class="mh10 mb40" style="margin-top: -115px;">
                <div class="table autoMargin">
                    <div class="cell pr20">
                        <a href="${urlPath}/search" class="mypageMainBtn jsTouchActive fs16 relative zIndex20 pt20 mv5">
                            <img src="${imagePath}/images/mypage/board_1.png" width="130" class="block leftSide">
                        </a>
                    </div>
                    <div class="cell vTop">
                        <a href="${urlPath}/box" class="mypageMainBtn jsTouchActive fs16 relative zIndex20 pt20 mv5">
                            <img src="${imagePath}/images/mypage/board_2.png" width="130" class="block rightSide">
                        </a>
                    </div>
                </div>
            </div>

        </section>

        <#-- リンクナビ -->
        <nav style="margin-bottom: -6px;">
            <ul class="footerLinkList">
                <li class="textRight pv5 pr10">
                    <a href="${urlPath}/static/?page=howto" class="fcWhite">遊び方♪ &gt;&gt;</a>
                </li>
                <li class="textRight pv5 pr10">
                    <a href="${urlPath}/static/?page=terms" class="fcWhite">利用規約 &gt;&gt;</a>
                </li>
            </ul>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>

</html>