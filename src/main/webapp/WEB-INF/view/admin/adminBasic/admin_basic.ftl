<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>
    
    <body class="outline formContents">
        <section>
            基本情報
        </section>
        <section>
        	
        	<form method="post" action="${urlPath!?html}/admin/adminBasic/regist" name="frm">
        		<div>
        			店舗名：<input type="text" id="shopName" name="shopName">
        		</div>
        		<div>
        			店舗説明：<input type="text" id="description" name="description">
        		</div>
        		<div>
        			URL：<input type="text" id="url" name="url">
        		</div>
        		<div>
        			電話番号：<input type="text" id="tell" name="tell">
        		</div>
        		<div>
        			住所：<input type="text" id="address" name="address">
        		</div>
        		<div>
        			最寄駅：<input type="text" id="station" name="station">
        		</div>
        	</form>
        	
        	<div class="textCenter mv10">
                <a id="js_registBtn" href="javascript:void(0)" class="btn btnNormal jsTouchActive autoMargin">ログイン</a>
            </div>
        </section>
        
        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
        
        <#-- JS - ログイン - -->
        <script>
            (function(){
                var loginBtn = ci.qs('#js_registBtn');
                ci.bind(loginBtn, 'click', function(){
                    document.frm.submit();
                });
            })();
        </script>
        
    </body>
</html>