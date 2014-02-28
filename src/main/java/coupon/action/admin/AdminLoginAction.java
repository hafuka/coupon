package coupon.action.admin;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.IAdminAuthentication;
import coupon.service.AdminService;
import coupon.service.ShopService;

/**
 * 管理者ログイン
 */
public class AdminLoginAction extends AdminBaseAction {
	
	@Resource
	protected AdminService adminService;
	@Resource
	protected ShopService shopService;
	
	public String email;
	public String password;
	
	public String errorMsg;
	
	@Execute(validator=false)
	public String index() {
		return "admin_login.ftl";
	}
	@Execute(validator=false)
	public String login() throws Exception {
		
//		// 入力チェック
//		if (!this.checkInput()) {
//			return "/login/login.ftl";
//		}
//		
//		// ログインチェック
//		if (!userService.checkLogin(email, password)) {
//			errorMsg = "emailまたはパスワードが間違っています";
//			return "/login/login.ftl";
//		}
		
		IAdminAuthentication iUserAuthentication = adminService.getIAdminAuth(email, password);
		if (iUserAuthentication == null) {
			errorMsg = "アカウント情報が存在しません。新規登録してください";
			return "/login/login.ftl";
		}
		
		loginAdminDto.shopId = iUserAuthentication.shopId;
		
//		String cookieValue = loginService.insertIUserLogin(iUser.userId);
//		super.setCookie(cookieValue);
		
		
		return "/admin/adminMenu?redirect=true";
	}
}
