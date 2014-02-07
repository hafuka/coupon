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
            	<h1>購入内容の確認</h1>
            	<div>
					合計 100コイン
				</div>
				<div>
					利用可能コイン ${userCoin!?html}コイン
				</div>
            	<form method="post" action="${urlPath!?html}/payment/confirm" name="frm">
            		<#list coinList as coin>
            			<div class="mt5">
            				<input type="radio" name="coinId" value="${coin.id!?html}" <#if coin_index == 0>checked="checked"</#if>>${coin.coin!?html}コイン(${coin.yen!?html}円)
            			</div>
            		</#list>
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
                
                var confirmBtn = ci.qs('#js_confirmBtn');
                
                ci.bind(confirmBtn, 'click', function(){
                    document.frm.submit();
                });
            })();
        </script>
    </body>
</html>