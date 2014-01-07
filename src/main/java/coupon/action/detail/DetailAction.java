package coupon.action.detail;

import org.seasar.struts.annotation.Execute;

public class DetailAction {
	
	@Execute(validator=false)
	public String index() {
		return "/detail/detail.ftl";
	}
}
