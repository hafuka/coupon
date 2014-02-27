package coupon.service;

import coupon.dto.CouponDto;
import coupon.entity.IUser;


public interface RouletteService {

	public abstract boolean checkDailyRoulette(IUser iUser);

	public abstract CouponDto execRoulette(IUser iUser, Integer areaId, Integer areaDetailId, Integer businessId);
	
	public abstract CouponDto execRouletteByPoint(IUser iUser, Integer areaId, Integer areaDetailId, Integer businessId);

	public abstract CouponDto execPremiumRoulette(Long userId, Integer shopId, Long userPoint);


}
