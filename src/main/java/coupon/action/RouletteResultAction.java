package coupon.action;

import org.seasar.struts.annotation.Execute;

import coupon.dto.CouponDto;
import coupon.enums.TransactionType;

public class RouletteResultAction extends BaseAction {
	
	public CouponDto coupon;
	
	@Execute(validator=false)
	public String index() {
		if (!isValidToken(token)) {
			throw new IllegalArgumentException("Tokenエラー");
		}
		coupon = (CouponDto)super.getTransactionData(TransactionType.NORMAL_ROULETTE);
		return "/roulette/result.ftl";
	}
}
