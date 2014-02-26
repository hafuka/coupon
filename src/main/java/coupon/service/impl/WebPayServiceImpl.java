package coupon.service.impl;

import java.sql.Timestamp;

import javax.annotation.Resource;

import jp.webpay.api.WebPayClient;
import jp.webpay.model.Card;
import jp.webpay.model.Customer;
import jp.webpay.request.CardRequest;
import jp.webpay.request.ChargeRequest;
import jp.webpay.request.CustomerRequest;

import org.apache.commons.lang.StringUtils;
import org.seasar.framework.util.ResourceUtil;
import org.seasar.framework.util.StringUtil;

import coupon.entity.IUser;
import coupon.service.UserService;
import coupon.service.WebPayService;
import coupon.util.CouponDateUtils;

public class WebPayServiceImpl implements WebPayService {
	
	private static final Integer SAVE = 1;
	private static final Integer NOT_SAVE = 0;
	
	@Resource
	protected UserService userService;

	public String publicKey = ResourceUtil.getProperties("webpay.properties").getProperty("publicKey");
	public String privateKey = ResourceUtil.getProperties("webpay.properties").getProperty("privateKey");

	@Override
	public void doPayment(Long userId, String cardName, String cardNo, Integer month, Integer year, Integer cvc, Integer amount, boolean saveCard) {

		IUser iUser = userService.getIUser(userId);
		
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
		
		
		Timestamp nowDate = CouponDateUtils.getCurrentDate();
		if (saveCard && iUser.saveCardFlg.equals(NOT_SAVE)) {
			CustomerRequest customerRequest = new CustomerRequest().card(cardRequest);
			Customer customer = client.customers.create(customerRequest);
			iUser.customerId = customer.getId();
			iUser.saveCardFlg = SAVE;
			iUser.updDatetime = nowDate;
			userService.updateIUser(iUser);
		}
		if (!saveCard && iUser.saveCardFlg.equals(SAVE)) {
			iUser.customerId = null;
			iUser.saveCardFlg = NOT_SAVE;
			iUser.updDatetime = nowDate;
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

	@Override
	public Card getCardInfo(IUser iUser) {
		if (!StringUtils.isEmpty(iUser.customerId)) {
			// 顧客情報取得
			WebPayClient client = new WebPayClient(privateKey);
			Customer customer = client.customers.retrieve(iUser.customerId).getCustomer();
			return customer.getActiveCard();
		}
		
		return null;
	}

}
