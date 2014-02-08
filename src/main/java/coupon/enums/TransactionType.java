package coupon.enums;

public enum TransactionType {

	NORMAL_ROULETTE("normal-roulette"),
	PREMIUM_ROULETTE("premium-roulette"),
	TO_PAYMENT("to_payment"),
	TO_ROULETTE("to_roulette"),
	;

	public String key;

	private TransactionType(String key) {
		this.key = key;
	}

}
