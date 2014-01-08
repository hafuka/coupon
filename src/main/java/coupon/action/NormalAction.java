package coupon.action;

import org.seasar.struts.annotation.Execute;

public class NormalAction {

	@Execute(validator = false)
	public String index() {
        return "/normal/normal.ftl";
	}
	
}
