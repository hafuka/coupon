package coupon.action;

import org.seasar.struts.annotation.Execute;

import coupon.dto.CouponDto;
import coupon.enums.TransactionType;

public class RouletteResultAction extends BaseAction {

	public CouponDto coupon;

	@Execute(validator=false)
	public String index() throws Exception {
		if (!isValidToken(token)) {
			throw new IllegalArgumentException("Tokenエラー");
		}
		coupon = (CouponDto)super.getTransactionData(loginUserDto.userId, TransactionType.NORMAL_ROULETTE);
		if (coupon == null) {
			throw new Exception();
		}

		return "/roulette/result.ftl";
	}
}
