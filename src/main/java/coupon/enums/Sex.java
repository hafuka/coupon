package coupon.enums;

public enum Sex {

	MALE(1,"男性"),
	FEMALE(2,"女性"),
	;

	public Integer key;
	public String value;

	private Sex(Integer key, String value) {
		this.key = key;
		this.value = value;
	}
}
