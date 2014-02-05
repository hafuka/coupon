package coupon.service;

import coupon.dto.CouponDto;
import coupon.entity.IUserCoin;


public interface RouletteService {

	public abstract boolean checkDailyRoulette(Long userId);
	
	
	public abstract CouponDto execRoulette(Long userId, boolean premiumFlg);
	
	public abstract IUserCoin getIUserTicket(Long userId);
}
