package coupon.action;

import javax.annotation.Resource;

import org.seasar.framework.util.StringUtil;
import org.seasar.struts.annotation.Execute;

import coupon.service.UserService;

public class RegisterAction extends BaseAction {
	
	@Resource
	protected UserService userService;
	
	
	public String email;
	public String password;
	public String name;
	
	public String errorMsg;
	
	/**
	 * 初期表示
	 * @return
	 */
	@Execute(validator=false)
	public String index() {
		return "/register/register.ftl";
	}
	
	/**
	 * 登録処理
	 * @return
	 * @throws Exception 
	 */
	@Execute(validator=false)
	public String regist() throws Exception {
		
		// 入力チェック
		if (!checkInput()) {
			return "/register/register.ftl";
		}
		
		// ユーザー情報登録
		userService.registUser(email, password, name);
		
		loginUserDto.userId = 1L;
		loginUserDto.name = name;
		loginUserDto.point = 0L;
		
		return "/mypage?redirect=true";
	}
	
	/**
	 * 入力チェック
	 * @return
	 */
	private boolean checkInput() {
		if (StringUtil.isEmpty(email) || StringUtil.isEmpty(password) || StringUtil.isEmpty(name)) {
			errorMsg = "全ての項目を入力してください";
			return false;
		}
		
		//Eメール　の正規表現パターン  
		String emailPattern = "[0-9a-zA-Z_\\-]+@[0-9a-zA-Z_\\-]+(\\.[0-9a-zA-Z_\\-]+){1,}"; 
		if (!email.matches(emailPattern)) {
			errorMsg = "正しいemailアドレスを入力してください";
			return false;
		}
		
		return true;
	}
	
}
