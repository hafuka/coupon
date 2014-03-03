package coupon.service;

import java.util.List;

import coupon.entity.MCoin;


public interface PaymentService {

	/**
	 * ユーザーコイン情報取得
	 * @param userId
	 * @return
	 */
	public abstract int getIUserCoin(Long userId);
	
	public abstract List<MCoin> getCoinList();
	
	public abstract MCoin getCoin(Integer id);
	
	public void execPayment(Long userId, Integer coinId, String cardName, String cardNo, Integer month, Integer year, Integer cvc, boolean saveCard);
}
