package coupon.action;

import org.seasar.struts.annotation.Execute;

public class DetailAction {
	
	@Execute(validator=false)
	public String index() {
		return "/detail/detail.ftl";
	}
}
