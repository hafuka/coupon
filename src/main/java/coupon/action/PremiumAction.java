package coupon.action;

import org.seasar.struts.annotation.Execute;

public class PremiumAction {

	@Execute(validator=false)
	public String index(){
		return "/premium/premium.ftl";
	}
	
}