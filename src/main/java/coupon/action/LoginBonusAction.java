package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.MLoginBonus;
import coupon.service.LoginBonusService;

public class LoginBonusAction extends BaseAction {
	
	@Resource
	protected LoginBonusService loginBonusService;
	
	public MLoginBonus loginBonus;
	
	@Execute(validator=false)
	public String index() {
		
		if (!loginBonusService.isLoginBonus(loginUserDto.userId)) {
			return "/mypage?redirect=true";
		}
		
		// ログインボーナス付与処理
		loginBonus = loginBonusService.sendLoginBonus(loginUserDto.userId);
		if (loginBonus == null) {
			return "/error.ftl";
		}
		
		return "/mypage/login-bonus.ftl";
	}
}
