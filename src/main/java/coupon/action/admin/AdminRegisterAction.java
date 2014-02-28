package coupon.action.admin;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.service.AdminService;

public class AdminRegisterAction extends AdminBaseAction {
	
	@Resource
	protected AdminService adminService;
	
	public String email;
	public String password;
	
	@Execute(validator=false)
	public String index() throws Exception {
		return "admin_register.ftl";
	}
	
	@Execute(validator=false)
	public String regist() throws Exception {
		Integer shopId = adminService.regist(email, password);
		loginAdminDto.shopId = shopId;
		return "/admin/adminMenu?redirect=true";
	}
}
