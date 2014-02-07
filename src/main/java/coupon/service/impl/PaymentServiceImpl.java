package coupon.service.impl;

import javax.annotation.Resource;

import coupon.dao.IUserCoinDao;
import coupon.entity.IUserCoin;
import coupon.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {

	@Resource
	protected IUserCoinDao iUserCoinDao;
	
	@Override
	public int getIUserCoin(Long userId) {
		IUserCoin userCoin = iUserCoinDao.findById(userId);
		if (userCoin != null) {
			return userCoin.coin;
		}
		return 0;
	}

}
