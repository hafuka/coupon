package coupon.service;

public interface WebPayService {

	
	void chargeToken(String token, Integer price);
}
