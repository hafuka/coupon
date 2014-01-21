package coupon.action;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.seasar.struts.annotation.Execute;

import coupon.entity.IUserAuthentication;
import coupon.service.UserService;

public class AccountConfirmAction extends BaseAction {

	public String confirmToken;
	
	@Resource
	protected UserService userService;
	
	@Execute(validator=false)
	public String index() throws Exception {
		
		if (!checkParam()) {
			throw new Exception();
		}
		
		IUserAuthentication iUserAuth = userService.getIUserAuth(confirmToken);
		if (iUserAuth == null || StringUtils.isEmpty(iUserAuth.registToken)) {
			throw new Exception();
		}
		iUserAuth.registToken = null;
		userService.updateIUserAuthentication(iUserAuth);
		
		return "/account/account-confirm.ftl";
	}
	
	private boolean checkParam() {
		if (StringUtils.isEmpty(confirmToken)) {
			return false;
		}
		return true;
	}
}
