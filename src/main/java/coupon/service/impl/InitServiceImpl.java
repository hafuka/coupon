package coupon.service.impl;

import coupon.service.InitService;

public class InitServiceImpl implements InitService {

	@Override
	public void init() {
		System.out.println("初期処理");
	}

}
