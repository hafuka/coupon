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
        
	        <form action="${urlPath}/purchase/purchase" method="post">
	        	<input type="hidden" name="price" value="100">
	  			<script src="https://checkout.webpay.jp/v1/" class="webpay-button" data-key="test_public_19DdUs78k2lV8PO8ZCaYX3JT" data-token-name="webpayToken"></script>
			</form>
        
        </section>

        <#-- フッターメニューのインクルード -->
        <#include "/common/footer.ftl">

        <#-- 共通JavaScriptのインクルード -->
        <#include "/common/htmlFoot.ftl">
    </body>
</html>