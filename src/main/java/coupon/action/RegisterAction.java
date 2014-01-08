package coupon.action;

import org.seasar.struts.annotation.Execute;

public class RegisterAction {

	@Execute(validator=false)
	public String index() {
		return "/register/register.ftl";
	}
	
}
