package coupon.action;

import org.seasar.struts.annotation.Execute;

/**
 * 課金トップアクション
 *
 */
public class PaymentAction extends BaseAction {

	@Execute(validator=false)
	public String index() {
		return "/payment/payment-top.ftl";
	}
}
