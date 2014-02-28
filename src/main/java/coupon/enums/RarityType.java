package coupon.enums;

public enum RarityType {
	N(1, "ノーマル"),
	R(2, "レア"),
	SR(3, "Ｓレア"),
	;
	public Integer value;
	
	public String name;
	
	private RarityType(Integer value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public static RarityType getEnum(Integer value) {
		for (RarityType rarityType : RarityType.values()) {
			if (rarityType.value.equals(value)) {
				return rarityType;
			}
		}
		return null;
	}
	
	public static boolean isSR(Integer value) {
		if (SR.value.equals(value)) {
			return true;
		}
		return false;
	}
}
