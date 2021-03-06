package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.IUser;
import coupon.entity.MLoginBonus;
import coupon.service.LoginBonusService;
import coupon.service.UserService;

public class LoginBonusAction extends BaseAction {
	
	@Resource
	protected LoginBonusService loginBonusService;
	@Resource
	protected UserService userService;
	
	public MLoginBonus loginBonus;
	
	@Execute(validator=false)
	public String index() {
		if (!isValidToken(token)) {
			throw new IllegalArgumentException("Tokenエラー");
		}
		IUser iUser = userService.getIUser(loginUserDto.userId);
		if (iUser == null) {
			throw new IllegalArgumentException("IUser is null.");
		}
		
		if (!loginBonusService.isLoginBonus(loginUserDto.userId)) {
			return "/mypage?redirect=true";
		}
		
		// ログインボーナス付与処理
		loginBonus = loginBonusService.sendLoginBonus(loginUserDto.userId);
		if (loginBonus == null) {
			return "/mypage?redirect=true";
		}
		
		return "/mypage/login-bonus.ftl";
	}
}
