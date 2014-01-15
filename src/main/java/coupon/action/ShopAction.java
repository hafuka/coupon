package coupon.action;

import org.seasar.struts.annotation.Execute;

public class ShopAction extends BaseAction {

	@Execute(validator=false)
	public String index() {
		return "/shop/shop.ftl";
	}
}
