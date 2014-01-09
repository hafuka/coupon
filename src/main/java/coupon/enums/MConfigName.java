package coupon.enums;

public enum MConfigName {

	LOGIN_BONUS_TIME("LOGIN_BONUS_TIME");

	/** DB上の区分 */
	private String key;

	private MConfigName(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

}
