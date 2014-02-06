package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.dto.CouponDto;
import coupon.entity.IUserCoin;
import coupon.enums.TransactionType;
import coupon.service.RouletteService;

public class PremiumRouletteAnimationAction extends BaseAction {
	
	@Resource
	protected RouletteService rouletteService;
	
	/***** IN項目 *****/
	public Integer shopId;
	
	/***** OUT項目 *****/
	public CouponDto coupon;
	
	@Execute(validator=false)
	public String index() {
		if (!isValidToken(token)) {
			throw new IllegalArgumentException("Tokenエラー");
		}

		IUserCoin iUserCoin = rouletteService.getIUserCoin(loginUserDto.userId);
		if (iUserCoin == null || iUserCoin.coin == null || iUserCoin.coin <= 0) {
			return "/payment?redirect=true";
		}
		
		// ルーレット実行処理
		coupon = rouletteService.execPremiumRoulette(loginUserDto.userId, shopId);
		setTransactionData(coupon, TransactionType.NORMAL_ROULETTE);
		super.getFormToken();
		return "/roulette/premium-animation.ftl";
	}
	
}
