package coupon.enums;


public enum Age {

	AGE_10(1,"10代"),
	AGE_20(1,"20代"),
	AGE_30(1,"30代"),
	AGE_40(1,"40代"),
	AGE_50(1,"50代"),
	AGE_60(1,"60代"),
	AGE_70(1,"70代"),
	AGE_80(1,"80代"),
	AGE_90(1,"90代"),
	AGE_100(1,"100代"),
	;

	public Integer key;
	public String value;

	private Age(Integer key, String value) {
		this.key = key;
		this.value = value;
	}
}
