package coupon.enums;

public enum TransactionType {

	NORMAL_ROULETTE("normal-roulette"),
	PREMIUM_ROULETTE("premium-roulette");

	private String key;

	private TransactionType(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

}
