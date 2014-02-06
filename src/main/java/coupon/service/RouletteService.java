package coupon.service;

import coupon.dto.CouponDto;
import coupon.entity.IUserCoin;


public interface RouletteService {

	public abstract boolean checkDailyRoulette(Long userId);
	
	
	public abstract CouponDto execRoulette(Long userId, boolean premiumFlg, Integer areaId, Integer areaDetailId, Integer businessId);
	
	public abstract CouponDto execPremiumRoulette(Long userId, Integer shopId);
	
	public abstract IUserCoin getIUserCoin(Long userId);
}
