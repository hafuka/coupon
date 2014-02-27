package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.IUser;
import coupon.entity.IUserCoin;
import coupon.enums.MConfigKey;
import coupon.service.CoinService;
import coupon.service.DailyProcessService;
import coupon.service.LoginBonusService;
import coupon.service.MConfigService;
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
	protected MConfigService mConfigService;
	@Resource
	protected CoinService coinService;

	public int coin;
	public int count;
	public long point;
	public String name;

	@Execute(validator = false)
	public String index() {

		// 日毎処理チェック
		dailyProcessCheck();

		// ログインボーナスチェック
		if (loginBonusService.isLoginBonus(loginUserDto.userId)) {
			return "/loginBonus?redirect=true";
		}
		
		IUser iUser = userService.getIUser(loginUserDto.userId);
		point = iUser.point;
		name = iUser.name;
		
		IUserCoin iUserCoin = coinService.getIUserCoin(loginUserDto.userId);
		if (iUserCoin != null) {
			coin = iUserCoin.coin;
		}

		int needCoin = Integer.parseInt(mConfigService.getConfigValue(MConfigKey.ONE_TIME_COIN));
		count = coin / needCoin;

        return "mypage.ftl";
	}


	/**
	 * 日毎処理チェック
	 */
	private void dailyProcessCheck() {

		IUser iUser = userService.getIUser(loginUserDto.userId);

		// 一日の初回ログイン
		if (iUser.loginDatetime == null || !CouponDateUtils.isToday(iUser.loginDatetime)) {
			// 日毎ログイン処理
			dailyProcessService.doDailyProcess(iUser);
			// クッキーの有効期限を更新
			super.updateCookieLimit();
		}
	}
}
