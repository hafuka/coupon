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
            <div class="formArea autoMargin m10">
            	<h1>コイン購入の確認</h1>
            	<div>
					コイン ${coin.coin!?html}コイン
				</div>
				<div>
					購入金額 ${coin.yen!?html}円
				</div>
            	<form method="post" action="${urlPath!?html}/payment/card" name="frm">
            		<input type="hidden" name="selectCoinId" value="${coin.id!?html}">
            		<div class="textCenter mv10">
               			<a id="js_confirmBtn" href="javascript:void(0)" class="btn btnPrimary jsTouchActive autoMargin">購入する</a>
            		</div>
            	</form>
            </div>
        </section>
		
        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
        
        
        <#-- JS - 新規登録 - -->
        <script>
            (function(){
                
                var registBtn = ci.qs('#js_confirmBtn');
                
                ci.bind(registBtn, 'click', function(){
                    document.frm.submit();
                });
            })();
        </script>
    </body>
</html>