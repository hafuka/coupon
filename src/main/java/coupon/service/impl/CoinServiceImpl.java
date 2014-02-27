package coupon.service.impl;

import java.sql.Timestamp;

import javax.annotation.Resource;

import coupon.dao.IUserCoinDao;
import coupon.entity.IUserCoin;
import coupon.service.CoinService;
import coupon.util.CouponDateUtils;

public class CoinServiceImpl implements CoinService {
	
	@Resource
	protected IUserCoinDao iUserCoinDao;
	
	@Override
	public IUserCoin getIUserCoin(Long userId) {
		return iUserCoinDao.findById(userId);
	}

	@Override
	public void useCoin(Long userId, Integer useCoin) {

		Timestamp nowDate = CouponDateUtils.getCurrentDate();

		IUserCoin userCoin = this.getIUserCoin(userId);
		int updCoin = userCoin.coin - useCoin;
		if (updCoin < 0) {
			updCoin = 0;
		}
		userCoin.coin = updCoin;
		userCoin.updDatetime = nowDate;

		iUserCoinDao.update(userCoin);
	}

}
