package coupon.service.impl;

import jp.webpay.api.WebPayClient;
import jp.webpay.request.CardRequest;
import jp.webpay.request.ChargeRequest;
import coupon.service.WebPayService;

public class WebPayServiceImpl implements WebPayService {
	
	public String publicKey;
	public String privateKey;
	
	@Override
	public void chargeToken(String token, Integer price) {
		
		WebPayClient client = new WebPayClient(privateKey);
		CardRequest cardRequest = new CardRequest()
		        .number("4242-4242-4242-4242")
		        .expMonth(11)
		        .expYear(2014)
		        .cvc(123)
		        .name("KEI KUBO");
		ChargeRequest chargeRequest = new ChargeRequest()
		        .amount(100)
		        .currency("jpy")
		        .card(cardRequest);
		client.charges.create(chargeRequest);
		
		
		
//		WebPayClient client = new WebPayClient(privateKey);
//		ChargeRequest chargeRequest = new ChargeRequest()
//		        .amount(price)
//		        .currency("jpy")
//		        .card(token);
//		client.charges.create(chargeRequest);
		
	}

}
