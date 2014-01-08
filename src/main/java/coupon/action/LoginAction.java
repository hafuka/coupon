package coupon.action;

import org.seasar.struts.annotation.Execute;

public class LoginAction extends BaseAction {
	
	public String email;
	public String password;
	public String errorMsg;

	@Execute(validator = false)
	public String index() {
		return "/login/login.ftl";
	}

	@Execute(validator = false)
	public String login() {
		return "/mypage?redirect=true";
	}


}
