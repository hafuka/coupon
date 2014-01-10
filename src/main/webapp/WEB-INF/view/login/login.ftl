<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>
    
    <body class="outline formContents">
        <script src="http://connect.facebook.net/en_US/all.js"></script>
        <script>FB.init({ appId:'343136175832911', cookie:true, status:true, xfbml:true });</script>
        <fb:login-button>Login with Facebook</fb:login-button>
        
        <#if errorMsg!?has_content>
            <div>
                ${errorMsg!?html}
            </div>
        </#if>
        
        <div class="formArea autoMargin m10">
            <h1>メールアドレスでログイン</h1>
            <form method="post" action="${urlPath!?html}/login/login" name="frm">
                <div>
                    <input type="email" name="email" id="email" placeholder="E-Mailアドレスを入力してね" value="${email!?html}">
                </div>
                <div>
                    <input type="password" name="password" id="password" placeholder="パスワードを入力してね" value="">
                </div>
            </form>
        </div>
        
        
        <nav>
            <div class="mv20">
                <div class="textCenter mv10">
                    <a id="js_loginBtn" href="javascript:void(0)" class="btn btnNormal jsTouchActive autoMargin">ログイン</a>
                </div>

                <div class="textCenter mv10">
                    <a href="${urlPath}/mypage" class="btn btnPrimary jsTouchActive autoMargin">新規会員登録</a>
                </div>
            </div>
        </nav>
        
        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
        
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