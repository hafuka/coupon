package coupon.service;

import coupon.entity.IUserLogin;

public interface LoginService {

	public abstract IUserLogin getIUserLogin(String cookieValue);
	
	public abstract String insertIUserLogin(Long userId)throws Exception;
}
