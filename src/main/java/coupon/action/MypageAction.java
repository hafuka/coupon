package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.IUser;
import coupon.service.DailyProcessService;
import coupon.service.LoginBonusService;
import coupon.service.UserService;
import coupon.util.CouponDateUtils;

public class MypageAction extends BaseAction {
	
	@Resource
	protected UserService userService;
	@Resource
	protected DailyProcessService dailyProcessService;
	@Resource
	protected LoginBonusService loginBonusService;
	
	@Execute(validator = false)
	public String index() {
		
		// 日毎処理チェック
		dailyProcessCheck();
		
		// ログインボーナスチェック
		if (loginBonusService.isLoginBonus(loginUserDto.userId)) {
			return "/loginBonus?redirect=true";
		}
		
        return "/mypage/mypage.ftl";
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
