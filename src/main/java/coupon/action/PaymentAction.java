package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.service.PaymentService;

/**
 * 課金トップアクション
 *
 */
public class PaymentAction extends BaseAction {

	@Resource
	protected PaymentService paymentService;
	
	public Integer userCoin;
	
	@Execute(validator=false)
	public String index() {
		userCoin = paymentService.getIUserCoin(loginUserDto.userId);
		return "/payment/payment-top.ftl";
	}
}
