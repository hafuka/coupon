package coupon.service;

import coupon.dto.CouponDto;


public interface RouletteService {

	public abstract boolean checkDailyRoulette(Long userId);
	
	
	public abstract CouponDto execRoulette(Long userId, boolean premiumFlg);
}
