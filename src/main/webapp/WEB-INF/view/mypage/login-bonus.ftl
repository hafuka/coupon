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
            ログインボーナス<br>
            ${loginBonus.point!?html}ポイントGETしました<br>
            ${loginUserDto.point - loginBonus.point} → ${point!?html}
        </section>

        <#-- リンクナビ -->
        <nav>
            <div class="textCenter mv20">
                <a href="${urlPath}/mypage" class="btn btnNormal jsTouchActive autoMargin">マイページへ</a>
            </div>
        </nav>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>

</html>