package coupon.service.impl;

import javax.annotation.Resource;

import jp.webpay.api.WebPayClient;
import jp.webpay.model.Customer;
import jp.webpay.request.CardRequest;
import jp.webpay.request.ChargeRequest;
import jp.webpay.request.CustomerRequest;

import org.seasar.framework.util.StringUtil;

import coupon.entity.IUser;
import coupon.service.UserService;
import coupon.service.WebPayService;
import coupon.util.CouponDateUtils;

public class WebPayServiceImpl implements WebPayService {

	@Resource
	protected UserService userService;

	public String publicKey;
	public String privateKey;

	@Override
	public void doPayment(Long userId, String cardName, String cardNo, Integer month, Integer year, Integer cvc, Integer amount, boolean saveCard) {
		WebPayClient client = new WebPayClient(privateKey);
		CardRequest cardRequest = new CardRequest()
		        .number(cardNo)
		        .expMonth(month)
		        .expYear(year)
		        .cvc(cvc)
		        .name(cardName);
		ChargeRequest chargeRequest = new ChargeRequest()
		        .amount(amount)
		        .currency("jpy")
		        .card(cardRequest);
		client.charges.create(chargeRequest);

		if (saveCard) {
			CustomerRequest customerRequest = new CustomerRequest().card(cardRequest);
			Customer customer = client.customers.create(customerRequest);

			System.out.println(customer.getId());

			IUser iUser = new IUser();
			iUser.userId = userId;
			iUser.customerId = customer.getId();
			iUser.updDatetime = CouponDateUtils.getCurrentDate();
			userService.updateIUser(iUser);

		}
	}

	@Override
	public void doPaymentByCustomerId(Long userId, Integer amount) {
		IUser iUser = userService.getIUser(userId);
		if (StringUtil.isEmpty(iUser.customerId)) {
			throw new IllegalArgumentException("customerIDがnullです userId=" + userId);
		}

		WebPayClient client = new WebPayClient(privateKey);
		ChargeRequest chargeRequest = new ChargeRequest()
		        .amount(amount)
		        .currency("jpy")
		        .customer(iUser.customerId);
		client.charges.create(chargeRequest);
	}

}
