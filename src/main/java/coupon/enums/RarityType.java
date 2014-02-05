package coupon.enums;

public enum RarityType {
	R(1),
	HR(2),
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
}
