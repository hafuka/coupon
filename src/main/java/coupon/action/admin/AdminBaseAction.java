package coupon.action.admin;

import javax.annotation.Resource;

import coupon.dto.LoginAdminDto;

public abstract class AdminBaseAction {
	@Resource
	public LoginAdminDto loginAdminDto;
}
