package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.dto.CouponDto;
import coupon.entity.IUser;
import coupon.enums.MConfigKey;
import coupon.enums.TransactionType;
import coupon.service.MConfigService;
import coupon.service.RouletteService;
import coupon.service.UserService;

public class RouletteAnimationAction extends BaseAction {

	@Resource
	protected RouletteService rouletteService;
	@Resource
	protected UserService userService;
	@Resource
	protected MConfigService mConfigService;

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

		this.checkParam();

		IUser iUser = userService.getIUser(loginUserDto.userId);
		boolean rouletteFlg = rouletteService.checkDailyRoulette(iUser);
		boolean usePointFlg = false;
		if (!rouletteFlg) {
			String needPointStr = mConfigService.getConfigValue(MConfigKey.ONE_TIME_POINT_NORMAL);
			if (iUser.point < Integer.parseInt(needPointStr)) {
				throw new IllegalArgumentException("ノーマルルーレットエラー");
			} else {
				usePointFlg = true;
			}
		}

		// ルーレット実行処理
		if (usePointFlg) {
			coupon = rouletteService.execRouletteByPoint(iUser, areaId, areaDetailId, businessId);
		} else {
			coupon = rouletteService.execRoulette(iUser, areaId, areaDetailId, businessId);
		}

		setTransactionData(loginUserDto.userId, coupon, TransactionType.NORMAL_ROULETTE);
		super.getFormToken();

		return "/roulette/normal-animation.ftl";
	}


	private void checkParam() {
		if (this.areaId == 0) {
			this.areaId = null;
		}
		if (this.areaDetailId == 0) {
			this.areaDetailId = null;
		}
		if (this.businessId == 0) {
			this.businessId = null;
		}
	}

}
