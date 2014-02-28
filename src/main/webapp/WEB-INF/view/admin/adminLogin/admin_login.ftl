<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>
    
    <body class="outline formContents">
        <#if errorMsg!?has_content>
            <div>
                ${errorMsg!?html}
            </div>
        </#if>
        
        <section>
            <div class="formArea autoMargin m10">
                <h1>ログイン</h1>
                <form method="post" action="${urlPath!?html}/admin/adminLogin/login" name="frm">
                    <div class="mt5">
                        <input type="text" name="email" id="email" placeholder="メールアドレスを入力してください" value="${email!?html}">
                    </div>
                    <div class="mt5">
                        <input type="password" name="password" id="password" placeholder="パスワードを入力してください" value="">
                    </div>
                </form>
                
                <div class="textCenter mv10">
                    <a id="js_loginBtn" href="javascript:void(0)" class="btn btnNormal jsTouchActive autoMargin">ログイン</a>
                </div>
            </div>
        </section>
        
        
        <nav>
            <div class="textCenter mv20">
                <a href="${urlPath}/admin/adminRegister" class="btn btnPrimary jsTouchActive autoMargin">新規管理者登録はこちら>></a>
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