package coupon.service.impl;

import java.sql.Timestamp;

import javax.annotation.Resource;

import coupon.dao.IAdminAuthenticationDao;
import coupon.dao.MShopDao;
import coupon.entity.IAdminAuthentication;
import coupon.service.AdminService;
import coupon.util.CouponDateUtils;
import coupon.util.CryptUtils;

public class AdminServiceImpl implements AdminService {
	
	@Resource
	protected IAdminAuthenticationDao iAdminAuthenticationDao;
	@Resource
	protected MShopDao mShopDao;
	
	@Override
	public Integer regist(String email, String password) throws Exception {
		
		Timestamp nowDate = CouponDateUtils.getCurrentDate();
		Long shopId = mShopDao.getCount() + 1;
		IAdminAuthentication record = new IAdminAuthentication();
		record.shopId = Integer.parseInt(shopId.toString());
		record.email = email;
		record.password = CryptUtils.encrypt(password);
		record.insDatetime = nowDate;
		record.updDatetime = nowDate;
		iAdminAuthenticationDao.insert(record);
		
		return Integer.parseInt(shopId.toString());
		
	}

	@Override
	public IAdminAuthentication getIAdminAuth(String email, String password) throws Exception {
		return iAdminAuthenticationDao.findByEmailAndPassword(email, password);
	}

}
