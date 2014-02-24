package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.IUser;
import coupon.entity.IUserCoin;
import coupon.enums.MConfigKey;
import coupon.service.DailyProcessService;
import coupon.service.LoginBonusService;
import coupon.service.MConfigService;
import coupon.service.RouletteService;
import coupon.service.UserService;
import coupon.util.CouponDateUtils;

public class MypageAction extends BaseAction {

	@Resource
	protected UserService userService;
	@Resource
	protected DailyProcessService dailyProcessService;
	@Resource
	protected LoginBonusService loginBonusService;
	@Resource
	protected RouletteService rouletteService;
	@Resource
	protected MConfigService mConfigService;

	public Integer coin;
	public Integer count;

	@Execute(validator = false)
	public String index() {

		// 日毎処理チェック
		dailyProcessCheck();

		// ログインボーナスチェック
		if (loginBonusService.isLoginBonus(loginUserDto.userId)) {
			return "/loginBonus?redirect=true";
		}

		IUserCoin iUserCoin = userService.getIUserCoin(loginUserDto.userId);
		if (iUserCoin == null) {
			coin = 0;
		} else {
			coin = iUserCoin.coin;
		}

		int needCoin = Integer.parseInt(mConfigService.getConfigValue(MConfigKey.ONE_TIME_COIN));
		count = coin / needCoin;

        return "mypage.ftl";
	}


	/**
	 * 日毎処理チェック
	 */
	private String dailyProcessCheck() {

		IUser iUser = userService.getIUser(loginUserDto.userId);

		// 一日の初回ログイン
		if (iUser.loginDatetime == null || !CouponDateUtils.isToday(iUser.loginDatetime)) {
			// 日毎ログイン処理
			dailyProcessService.doDailyProcess(iUser);
			return "LOGIN";
		}
		return null;
	}
}
