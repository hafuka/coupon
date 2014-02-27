package coupon.enums;

public enum MConfigKey {

	/** ログインボーナス付与時間 */
	LOGIN_BONUS_TIME("LOGIN_BONUS_TIME"),
	/** プレミアムルーレット1回に必要なコイン数 */
	ONE_TIME_COIN("ONE_TIME_COIN"),
	/** プレミアムルーレット1回に必要なポイント数 */
	ONE_TIME_POINT("ONE_TIME_POINT"),
	/** クーポン使用時の有効時間 */
	USE_COUPON_LIMIT_TIME("USE_COUPON_LIMIT_TIME"),
	;

	/** DB上の区分 */
	public String key;

	private MConfigKey(String key) {
		this.key = key;
	}
}
