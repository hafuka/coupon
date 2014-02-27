package coupon.enums;

public enum UserCouponStatus {
	
	INIT(0),
	USED(1);
	public Integer key;
	
	private UserCouponStatus(Integer key) {
		this.key = key;
		
	}
}
