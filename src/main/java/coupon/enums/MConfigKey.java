package coupon.enums;

public enum MConfigKey {

	/** ログインボーナス付与時間 */
	LOGIN_BONUS_TIME("LOGIN_BONUS_TIME"),
	/** プレミアムルーレット1回に必要なコイン数 */
	ONE_TIME_COIN("ONE_TIME_COIN"),
	/** ノーマルルーレット1回に必要なポイント数 */
	ONE_TIME_POINT_NORMAL("ONE_TIME_POINT_NORMAL"),
	/** プレミアムルーレット1回に必要なポイント数 */
	ONE_TIME_POINT_PREMIUM("ONE_TIME_POINT_PREMIUM"),
	/** クーポン使用時の有効時間 */
	USE_COUPON_LIMIT_TIME("USE_COUPON_LIMIT_TIME"),
	/** クーポン有効期限 */
	COUPON_LIMIT_DAYS("COUPON_LIMIT_DAYS"),
	/** webpayメンテナンス */
	WEB_PAY_MAINTENANCE("WEB_PAY_MAINTENANCE"),
	;

	/** DB上の区分 */
	public String key;

	private MConfigKey(String key) {
		this.key = key;
	}
}
