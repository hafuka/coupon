package coupon.enums;

public enum RarityType {
	N(1),
	R(2),
	SR(3),
	;
	public Integer value;
	
	private RarityType(Integer value) {
		this.value = value;
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
