package coupon.service.impl;

import java.sql.Timestamp;

import javax.annotation.Resource;

import coupon.dao.IUserDao;
import coupon.entity.IUser;
import coupon.service.DailyProcessService;
import coupon.util.CouponDateUtils;

public class DailyProcessServiceImpl implements DailyProcessService {
	
	@Resource
	protected IUserDao iUserDao;
	
	@Override
	public void doDailyProcess(IUser iUser) {
		Timestamp nowDate = CouponDateUtils.getCurrentDate();
		iUser.loginDatetime = nowDate;
		iUser.updDatetime = nowDate;
		iUserDao.update(iUser);
	}

}
