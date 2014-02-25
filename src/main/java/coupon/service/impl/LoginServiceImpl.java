package coupon.service.impl;

import javax.annotation.Resource;

import coupon.dao.IUserLoginDao;
import coupon.entity.IUserLogin;
import coupon.service.LoginService;
import coupon.util.CryptUtils;

public class LoginServiceImpl implements LoginService {

	@Resource
	protected IUserLoginDao iUserLoginDao;
	
	@Override
	public IUserLogin getIUserLogin(String cookieValue) {
		return iUserLoginDao.findById(cookieValue);
	}

	@Override
	public String insertIUserLogin(Long userId) throws Exception {
		String cookieValue = this.generateCookieValue(userId);
		IUserLogin record = new IUserLogin();
		record.cookieValue = cookieValue;
		record.userId = userId;
		iUserLoginDao.insert(record);
		return cookieValue;
	}
	
	
	private String generateCookieValue(Long userId) throws Exception {
		return CryptUtils.encrypt(userId.toString()) + "_" + Long.toString(System.nanoTime()) + "_" + Math.random();
	}

}
