package coupon.service;

import java.util.List;

import coupon.entity.IUserCoin;


public interface CoinService {

	public abstract void useCoin(Long userId, Integer useCoin);

	Integer getIUserCoinCount(Long userId);

	List<IUserCoin> getIUserCoins(Long userId);
}
