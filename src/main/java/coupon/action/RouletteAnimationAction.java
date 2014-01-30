package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.dto.CouponDto;
import coupon.enums.TransactionType;
import coupon.service.RouletteService;

public class RouletteAnimationAction extends BaseAction {
	
	@Resource
	protected RouletteService rouletteService;
	
	public CouponDto coupon;
	
	@Execute(validator=false)
	public String index() {
		if (!isValidToken(token)) {
			throw new IllegalArgumentException("Tokenエラー");
		}
		if (!rouletteService.checkDailyRoulette(loginUserDto.userId)) {
			throw new IllegalArgumentException("日毎ルーレット回数エラー");
		}
		
		// ルーレット実行処理
		coupon = rouletteService.execRoulette(loginUserDto.userId, false);
		setTransactionData(coupon, TransactionType.NORMAL_ROULETTE);
		super.getFormToken();
		
		return "/roulette/coupon-animation.ftl";
	}
	
}
