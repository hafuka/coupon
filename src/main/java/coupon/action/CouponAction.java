package coupon.action;

import org.seasar.struts.annotation.Execute;

public class CouponAction {

	@Execute(validator = false)
	public String index() {
        return "/coupon/coupon.ftl";
	}
	
}
