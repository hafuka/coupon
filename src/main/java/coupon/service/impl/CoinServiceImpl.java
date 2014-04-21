package coupon.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;

import coupon.dao.IUserCoinDao;
import coupon.entity.IUserCoin;
import coupon.service.CoinService;
import coupon.util.CouponDateUtils;

public class CoinServiceImpl implements CoinService {

	@Resource
	protected IUserCoinDao iUserCoinDao;

	@Override
	public void useCoin(Long userId, Integer useCoin) {

		Timestamp nowDate = CouponDateUtils.getCurrentDate();

		IUserCoin userCoin = this.getOldestUserCoin(userId);
		int updCoin = userCoin.coin - useCoin;
		if (updCoin < 0) {
			updCoin = 0;
		}
		userCoin.coin = updCoin;
		userCoin.updDatetime = nowDate;

		iUserCoinDao.update(userCoin);
	}

	@Override
	public List<IUserCoin> getIUserCoins(Long userId) {
		return iUserCoinDao.findByUserIdOrderByLimitDatetimeAsc(userId);
	}

	@Override
	public Integer getIUserCoinCount(Long userId) {
		List<IUserCoin> iUserCoins = this.getIUserCoins(userId);
		if (CollectionUtils.isNotEmpty(iUserCoins)) {
			int count = 0;
			for (IUserCoin iUserCoin : iUserCoins) {
				count += iUserCoin.coin;
			}
			return count;
		}
		return 0;
	}

	private IUserCoin getOldestUserCoin(Long userId) {
		List<IUserCoin> iUserCoins = this.getIUserCoins(userId);
		if (CollectionUtils.isNotEmpty(iUserCoins)) {
			return iUserCoins.get(0);
		}
		return null;
	}

}
