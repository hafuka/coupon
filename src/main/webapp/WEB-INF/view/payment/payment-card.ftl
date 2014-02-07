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
            	<h1>クレジットでのお支払</h1>
				<div>
					利用可能なクレジットカード<br>
					<img src="${imagePath}/images/payment/cards.png" width="300"><br>
					VISA, MasterCard, JCB, American Express, Diners
				</div>
            	<form method="post" action="${urlPath!?html}/payment/cardConfirm" name="frm">
            		
            		<div class="mt5">
                        名義<input type="text" name="cardName" id="cardNo" placeholder="名義">
                    </div>
            		<div class="mt5">
                        カード番号<input type="text" name="cardNo" id="cardNo" placeholder="カード番号">
                    </div>
                    <div class="mt5">
                    	有効期限
                        <select id="month" name="month">
                        	<option value="0"></option>
                        	<option value="1">1</option>
                        	<option value="2">2</option>
                        	<option value="3">3</option>
                        	<option value="4">4</option>
                        	<option value="5">5</option>
                        	<option value="6">6</option>
                        	<option value="7">7</option>
                        	<option value="8">8</option>
                        	<option value="9">9</option>
                        	<option value="10">10</option>
                        	<option value="11">11</option>
                        	<option value="12">12</option>
                        </select>
                        月／
                        <select id="year" name="year">
                        	<option value="0"></option>
                        	<option value="2014">2014</option>
                        	<option value="2015">2015</option>
                        	<option value="2016">2016</option>
                        	<option value="2017">2017</option>
                        	<option value="2018">2018</option>
                        	<option value="2019">2019</option>
                        	<option value="2020">2020</option>
                        	<option value="2021">2021</option>
                        	<option value="2022">2022</option>
                        	<option value="2023">2023</option>
                        	<option value="2024">2024</option>
                        	<option value="2025">2025</option>
                        </select>
                        年
                    </div>
                    <div class="mt5">
                        セキュリティコード<input type="text" name="cvc" id="cvc">
                    </div>
            		
            		
            		<div class="textCenter mv10">
               			<a id="js_nextBtn" href="javascript:void(0)" class="btn btnPrimary jsTouchActive autoMargin">次へ</a>
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
                
                var nextBtn = ci.qs('#js_nextBtn');
                
                ci.bind(nextBtn, 'click', function(){
                    document.frm.submit();
                });
            })();
        </script>
    </body>
</html>