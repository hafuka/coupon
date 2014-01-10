package coupon.action;

import javax.annotation.Resource;

import org.seasar.framework.util.StringUtil;
import org.seasar.struts.annotation.Execute;

import coupon.entity.IUser;
import coupon.entity.IUserAuthentication;
import coupon.service.UserService;

public class LoginAction extends BaseAction {
	
	@Resource
	protected UserService userService;
	
	public String email;
	public String password;
	public String errorMsg;

	@Execute(validator = false)
	public String index() throws Exception {
		
		// ログイン済みの場合はmypageへリダイレクト
		if (loginUserDto != null && loginUserDto.userId != null) {
			return "/mypage?redirect=true";
		}
		
		return "/login/login.ftl";
	}

	@Execute(validator = false)
	public String login() throws Exception {
		
		// 入力チェック
		if (!this.checkInput()) {
			return "/login/login.ftl";
		}
		
		// ログインチェック
		if (!userService.checkLogin(email, password)) {
			errorMsg = "emailまたはパスワードが間違っています";
			return "/login/login.ftl";
		}
		
		IUserAuthentication iUserAuthentication = userService.getIUserAuth(email, password);
		if (iUserAuthentication == null) {
			errorMsg = "アカウント情報が存在しません。新規登録してください";
			return "/login/login.ftl";
		}
		IUser iUser = userService.getIUser(iUserAuthentication.userId);
		if (iUser == null) {
			errorMsg = "アカウント情報が存在しません。新規登録してください";
			return "/login/login.ftl";
		}
		
		loginUserDto.userId = iUser.userId;
		loginUserDto.name = iUser.name;
		loginUserDto.point = iUser.point;
		
		return "/mypage?redirect=true";
	}
	
	/**
	 * 入力チェック
	 * @return
	 */
	private boolean checkInput() {
		
		if (StringUtil.isEmpty(email) || StringUtil.isEmpty(password)) {
			errorMsg = "emailとpasswordの両方を入力してください";
			return false;
		} else {
			//Eメール　の正規表現パターン  
			String emailPattern = "[0-9a-zA-Z_\\-]+@[0-9a-zA-Z_\\-]+(\\.[0-9a-zA-Z_\\-]+){1,}"; 
			if (!email.matches(emailPattern)) {
				errorMsg = "正しいemailアドレスを入力してください";
				return false;
			}
		}
		return true;
	}
}
