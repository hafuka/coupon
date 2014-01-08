<!DOCTYPE html>
<html lang="ja">
    <head>
        <#-- 共通headのインクルード -->
        <#include "/common/htmlHead.ftl">
    </head>
    
    <body class="outline topContents">
		<script src="http://connect.facebook.net/en_US/all.js"></script>
		<script>FB.init({ appId:'343136175832911', cookie:true, status:true, xfbml:true });</script>
		<fb:login-button>Login with Facebook</fb:login-button>
		
		<form method="post" action="${urlPath!?html}/login/login" name="frm">
	        <div>
	        	<input type="email" name="email" id="email" placeholder="Enter email" value="">
	        </div>
	        <div>
	        	<input type="password" name="password" id="password" placeholder="Enter password" value="">
	        </div>
	    </form>
		
		
        <nav>
            <div class="mv20">
                <div class="textCenter mv10">
                    <a href="javascript:void(0)" class="btn btnNormal jsTouchActive autoMargin" onclick="btnOk();">ログイン</a>
                </div>

                <div class="textCenter mv10">
                    <a href="${urlPath}/mypage" class="btn btnPrimary jsTouchActive autoMargin">新規会員登録</a>
                </div>
            </div>
        </nav>
		
		
		<script type="text/javascript">
		function btnOk() {
			document.frm.submit();
		}
	</script>
		
    </body>
</html>