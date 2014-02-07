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
					コイン 100コイン
				</div>
				<div>
					利用可能コイン ${userCoin!?html}コイン
				</div>
            	<form method="post" action="${urlPath!?html}/payment/confirm" name="frm">
            		<div class="mt5">
            			<input type="radio" name="coin" value="100" checked="checked">100コイン(105円)
            		</div>
            		<div class="mt5">
            			<input type="radio" name="coin" value="300" >330コイン(315円)
            		</div>
            		<div class="mt5">
            			<input type="radio" name="coin" value="500" >550コイン(525円)
            		</div>
            		<div class="mt5">
            			<input type="radio" name="coin" value="1000" >1100コイン(1050円)
            		</div>
            		<div class="mt5">
            			<input type="radio" name="coin" value="2000" >2200コイン(2100円)
            		</div>
            		<div class="mt5">
            			<input type="radio" name="coin" value="3000" >3300コイン(3150円)
            		</div>
            		<div class="mt5">
            			<input type="radio" name="coin" value="4000" >4400コイン(4200円)
            		</div>
            		<div class="mt5">
            			<input type="radio" name="coin" value="5000" >5500コイン(5250円)
            		</div>
            		<div class="textCenter mv10">
               			<a id="js_confirmBtn" href="javascript:void(0)" class="btn btnPrimary jsTouchActive autoMargin">内容を確認する</a>
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