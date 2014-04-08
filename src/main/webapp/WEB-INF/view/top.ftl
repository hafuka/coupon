<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline topContents">

        <section>
            <div class="mt10 headMarqueeArea relative">
                <img src="${imagePath}/images/top/airship.png" width="230" height="47" class="marqueeImage">
            </div>

            <div class="textCenter mt5">
                <img src="${imagePath}/images/top/top_main.png" width="290" height="290">
            </div>
        </section>

        <nav>
            <div>
            	<div class="textCenter mb10">
                    <a href="${urlPath}/facebookLogin" class="btn btnBlue jsTouchActive autoMargin">
                        <img src="${imagePath}/images/facebook/fb_logo.png" width="30" height="30">
                    </a>
	            </div>
                <div class="textCenter mb10">
                    <a href="${urlPath}/login" class="btn btnNormal jsTouchActive autoMargin">ログイン</a>
                </div>
                <div class="textCenter mb20">
                    <a href="${urlPath}/register" class="btn btnPrimary jsTouchActive autoMargin">かんたん新規会員登録>></a>
                </div>
            </div>
        </nav>

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

    </body>
</html>