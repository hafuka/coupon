package coupon.action;

import org.seasar.framework.util.StringUtil;
import org.seasar.struts.annotation.Execute;

public class LoginAction {
	
	public String email;
	public String password;
	public String errorMsg;

	@Execute(validator = false)
	public String index() {
		return "/login/login.ftl";
	}

	@Execute(validator = false)
	public String login() {
		
		if (!this.checkInput()) {
			return "/login/login.ftl";
		}
		return "/mypage?redirect=true";
	}
	
	/**
	 * 入力チェック
	 * @return
	 */
	private boolean checkInput() {
		
		if (StringUtil.isEmpty(email) || StringUtil.isEmpty(password)) {
			errorMsg = "emailとpasswordの両方を入力してください";
			return false;
		} else {
			//Eメール　の正規表現パターン  
			String emailPattern = "[0-9a-zA-Z_\\-]+@[0-9a-zA-Z_\\-]+(\\.[0-9a-zA-Z_\\-]+){1,}"; 
			if (!email.matches(emailPattern)) {
				errorMsg = "正しいemailアドレスを入力してください";
				return false;
			}
		}
		return true;
	}
}
