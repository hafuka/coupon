<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>

    <body class="outline formContents">
        <!--
        <script src="http://connect.facebook.net/en_US/all.js"></script>
        <script>FB.init({ appId:'343136175832911', cookie:true, status:true, xfbml:true });</script>
        -->
        <#if errorMsg!?has_content>
            <div>
                ${errorMsg!?html}
            </div>
        </#if>

        <section>
            <div class="formArea autoMargin m10">
                <h1>Facebookでかんたんログイン</h1>
                <div class="mt5 autoMargin">
                    <p><a href="http://133.242.205.64/coupon_login/redirect.php"><img src="${imagePath}/images/facebook/fb_login.png"></a></p>
                </div>
            </div>
        </section>

        <section>
            <div class="formArea autoMargin m10">
                <h1>メールアドレスでログイン</h1>
                <form method="post" action="${urlPath!?html}/login/login" name="frm">
                    <div class="mt5">
                        <input type="email" name="email" id="email" placeholder="メールアドレスを入力してね" value="${email!?html}">
                    </div>
                    <div class="mt5">
                        <input type="password" name="password" id="password" placeholder="パスワードを入力してね" value="">
                    </div>
                </form>

                <div class="textCenter mv10">
                    <a id="js_loginBtn" href="javascript:void(0)" class="btn btnNormal jsTouchActive autoMargin">ログイン</a>
                </div>
            </div>
        </section>


        <nav>
            <div class="textCenter mv20">
                <a href="${urlPath}/register" class="btn btnPrimary jsTouchActive autoMargin">新規会員登録はこちら>></a>
            </div>
        </nav>

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">

        <#-- JS - ログイン - -->
        <script>
            (function(){

                var loginBtn = ci.qs('#js_loginBtn');

                ci.bind(loginBtn, 'click', function(){
                    document.frm.submit();
                });
            })();
        </script>

    </body>
</html>