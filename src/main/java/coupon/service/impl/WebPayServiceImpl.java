package coupon.service.impl;

import jp.webpay.api.WebPayClient;
import jp.webpay.model.Customer;
import jp.webpay.request.CardRequest;
import jp.webpay.request.ChargeRequest;
import jp.webpay.request.CustomerRequest;
import coupon.service.WebPayService;

public class WebPayServiceImpl implements WebPayService {
	
	public String publicKey;
	public String privateKey;
	
	@Override
	public void doPayment(String cardName, String cardNo, Integer month, Integer year, Integer cvc, Integer amount, boolean saveCard) {
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
			
			
		}
	}

}
