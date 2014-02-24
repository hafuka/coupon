package coupon.service.impl;

import javax.annotation.Resource;

import coupon.dao.MConfigDao;
import coupon.service.InitService;

public class InitServiceImpl implements InitService {
	
	@Resource
	protected MConfigDao mConfigDao;
	
	@Override
	public void init() {
		System.out.println("初期処理");
		
		mConfigDao.load();
	}

}
