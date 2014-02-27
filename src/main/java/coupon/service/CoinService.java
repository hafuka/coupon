package coupon.service;

import coupon.entity.IUserCoin;

public interface CoinService {

	public abstract IUserCoin getIUserCoin(Long userId);

	public abstract void useCoin(Long userId, Integer useCoin);
}
