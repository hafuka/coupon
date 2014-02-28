package coupon.action.admin;

import org.seasar.struts.annotation.Execute;

/**
 * 管理者メニュー
 */
public class AdminMenuAction {
	
	@Execute(validator=false)
	public String index() {
		return "admin_menu.ftl";
	}
}
