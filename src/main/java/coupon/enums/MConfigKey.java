package coupon.enums;

public enum MConfigKey {

	LOGIN_BONUS_TIME("LOGIN_BONUS_TIME"),
	ONE_TIME_COIN("ONE_TIME_COIN"),
	ONE_TIME_POINT("ONE_TIME_POINT"),
	;

	/** DB上の区分 */
	public String key;

	private MConfigKey(String key) {
		this.key = key;
	}
}
