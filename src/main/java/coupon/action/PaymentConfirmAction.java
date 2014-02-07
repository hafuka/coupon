package coupon.action;

import org.seasar.struts.annotation.Execute;

public class PaymentConfirmAction extends BaseAction {

	public Integer selectCoin;
	
	@Execute(validator=false)
	public String index() {
		return "/payment/payment-confirm.ftl";
	}
}
