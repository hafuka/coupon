package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.dto.CouponDto;
import coupon.enums.TransactionType;
import coupon.service.RouletteService;

public class RouletteAnimationAction extends BaseAction {

	@Resource
	protected RouletteService rouletteService;

	/***** IN項目 *****/
	public Integer areaId;
	public Integer areaDetailId;
	public Integer businessId;

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

		// ルーレット実行処理
		coupon = rouletteService.execRoulette(loginUserDto.userId, false, areaId, areaDetailId, businessId);
		setTransactionData(loginUserDto.userId, coupon, TransactionType.NORMAL_ROULETTE);
		super.getFormToken();

		return "/roulette/normal-animation.ftl";
	}

}
