package coupon.enums;

public enum CouponType {

	NORMAL(1),
	PREMIUM(2);

	/** DB上の区分 */
	private Integer key;

	private CouponType(Integer key) {
		this.key = key;
	}

	public Integer getKey() {
		return key;
	}

}
