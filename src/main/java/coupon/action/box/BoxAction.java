package coupon.action.box;

import org.seasar.struts.annotation.Execute;

public class BoxAction {
	
	@Execute(validator = false)
	public String index() {
        return "/box/box.ftl";
	}
}
