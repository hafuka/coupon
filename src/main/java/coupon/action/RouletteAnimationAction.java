package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.dto.CouponDto;
import coupon.entity.IUserCoin;
import coupon.enums.TransactionType;
import coupon.service.RouletteService;

public class RouletteAnimationAction extends BaseAction {
	
	@Resource
	protected RouletteService rouletteService;
	
	/***** IN項目 *****/
	public Integer shopId;
	public boolean premiumFlg;
	
	/***** OUT項目 *****/
	public CouponDto coupon;
	
	@Execute(validator=false)
	public String index() {
		if (!isValidToken(token)) {
			throw new IllegalArgumentException("Tokenエラー");
		}
//		if (!premiumFlg && !rouletteService.checkDailyRoulette(loginUserDto.userId)) {
//			throw new IllegalArgumentException("日毎ルーレット回数エラー");
//		}
		if (premiumFlg) {
			IUserCoin iUserCoin = rouletteService.getIUserTicket(loginUserDto.userId);
			if (iUserCoin == null || iUserCoin.coin == null || iUserCoin.coin <= 0) {
				throw new IllegalArgumentException("チケット枚数エラー");
			}
		}
		
		// ルーレット実行処理
		coupon = rouletteService.execRoulette(loginUserDto.userId, premiumFlg);
		setTransactionData(coupon, TransactionType.NORMAL_ROULETTE);
		super.getFormToken();
		
		if (premiumFlg) {
			return "/roulette/normal-animation.ftl";
		}
		return "/roulette/normal-animation.ftl";
	}
	
}
