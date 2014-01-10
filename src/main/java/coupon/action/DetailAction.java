package coupon.action;

import org.seasar.struts.annotation.Execute;

public class DetailAction extends BaseAction {
	
	@Execute(validator=false)
	public String index() {
		return "/detail/detail.ftl";
	}
}
