package coupon.service;

import jp.webpay.model.Card;
import coupon.entity.IUser;

public interface WebPayService {

	/**
	 * 課金処理
	 * @param cardName 名義
	 * @param cardNo カード番号
	 * @param month 月
	 * @param year 年
	 * @param cvc セキュリティーコード
	 * @param amount 金額
	 * @param saveCard カード情報保存フラグ
	 */
	void doPayment(Long userId, String cardName, String cardNo, Integer month, Integer year, Integer cvc, Integer amount, boolean saveCard);

	/**
	 * 課金処理
	 * @param userId
	 * @param amount
	 */
	void doPaymentByCustomerId(Long userId, Integer amount);
	
	/**
	 * 顧客情報所得
	 * @param userId
	 * @return
	 */
	Card getCardInfo(IUser iUser);
}
