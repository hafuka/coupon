package coupon.action;

import javax.annotation.Resource;

import coupon.dto.LoginUserDto;

public abstract class BaseAction {
	
	@Resource
	public LoginUserDto loginUserDto;
}
