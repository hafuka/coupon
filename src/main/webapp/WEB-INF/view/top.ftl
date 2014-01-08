<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>
    
    <body class="outline topContents">

        <section>
            <div class="mt20 headMarqueeArea relative">
                <img src="${imagePath}/images/airship.png" width="230" height="47" class="marqueeImage">
            </div>

            <div class="textCenter mt20">
                <img src="${imagePath}/images/top_main.png" width="290" height="290">
            </div>
        </section>

        <nav>
            <div class="mv20">
                <div class="textCenter mv10">
                    <a href="${urlPath}/mypage" class="btn btnNormal autoMargin fcWhite fs22">ログイン</a>
                </div>

                <div class="textCenter mv10">
                    <a href="${urlPath}/mypage" class="btn btnPrimary autoMargin fcWhite fs22">新規会員登録</a>
                </div>
            </div>
        </nav>

    </body>
</html>