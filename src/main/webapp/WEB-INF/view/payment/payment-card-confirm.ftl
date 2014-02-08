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
            	<h1>クレジットカードの確認</h1>
				<div>
					利用可能なクレジットカード<br>
					<img src="${imagePath}/images/payment/cards.png" width="200"><br>
					VISA, MasterCard, JCB, American Express, Diners
				</div>
            	<form method="post" action="${urlPath!?html}/payment/payment" name="frm">
					<input type="hidden" name="coinId" id="coinId" value="${coinId!?html}">
					<input type="hidden" name="cardName" id="cardName" value="${cardName!?html}">
					<input type="hidden" name="cardNo" id="cardNo" value="${cardNo!?html}">
					<input type="hidden" name="month" id="month" value="${month!?html}">
					<input type="hidden" name="year" id="year" value="${year?string.computer}">
					<input type="hidden" name="cvc" id="cvc" value="${cvc!?html}">
					<input type="hidden" name="saveCard" id="saveCard" value="${saveCard?string}">

            		<div class="mt5">
                        名義：${cardName!?html}
                    </div>
            		<div class="mt5">
                        カード番号：${cardNo!?html}
                    </div>
                    <div class="mt5">
                    	有効期限：${month!?html}月／${year?string.computer}
                        年
                    </div>
                    <div class="mt5">
                        セキュリティコード：${cvc!?html}
                    </div>
            		<div class="textCenter mv10">
               			<a id="js_paymentBtn" href="javascript:void(0)" class="btn btnPrimary jsTouchActive autoMargin">購入する</a>
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

                var paymentBtn = ci.qs('#js_paymentBtn');

                ci.bind(paymentBtn, 'click', function(){
                    document.frm.submit();
                });
            })();
        </script>
    </body>
</html>