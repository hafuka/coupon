<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>
    
    <body class="outline topContents">
		
		<#if errorMsg!?has_content>
			<div>
				${errorMsg!?html}
			</div>
		</#if>
		
		<form method="post" action="${urlPath!?html}/register/regist" name="frm">
	        <div>
	        	<input type="email" name="email" id="email" placeholder="Enter email" value="${email!?html}">
	        </div>
	        <div>
	        	<input type="password" name="password" id="password" placeholder="Enter password" value="">
	        </div>
	        <div>
	        	<input type="text" name="name" id="name" placeholder="Enter name" value="${name!?html}">
	        </div>
	    </form>
		
        <nav>
            <div class="mv20">
                <div class="textCenter mv10">
                    <a href="javascript:void(0)" class="btn btnPrimary jsTouchActive autoMargin" onclick="btnRegist();">登録</a>
                </div>
            </div>
        </nav>
		
		
		<script type="text/javascript">
			function btnRegist() {
				document.frm.submit();
			}
		</script>
    </body>
</html>