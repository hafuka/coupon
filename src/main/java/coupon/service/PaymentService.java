package coupon.service;


public interface PaymentService {

	/**
	 * ユーザーコイン情報取得
	 * @param userId
	 * @return
	 */
	public abstract int getIUserCoin(Long userId);
}
