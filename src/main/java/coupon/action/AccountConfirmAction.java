package coupon.action;

import org.apache.commons.lang.StringUtils;
import org.seasar.struts.annotation.Execute;

public class AccountConfirmAction extends BaseAction {

	public String confirmToken;
	
	
	@Execute(validator=false)
	public String index() {
		
		
		
		
		return "/account/account-confirm.ftl";
	}
	
	private boolean checkParam() {
		if (StringUtils.isEmpty(confirmToken)) {
			return false;
		}
		return true;
	}
}
