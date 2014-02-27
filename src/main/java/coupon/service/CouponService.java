package coupon.service;

import java.sql.Timestamp;
import java.util.List;

import coupon.entity.IUserCoupon;
import coupon.entity.MShopCoupon;

public interface CouponService {

	public abstract List<IUserCoupon> getIUserCoupons(Long userId);
	
	public abstract void insertIUserCoupon(Long userId, MShopCoupon mShopCoupon);

	public abstract void updateIUserCoupon(IUserCoupon iUserCoupon);
	
	public abstract String generateUserCouponId(long userId);
	
	public abstract IUserCoupon getIUserCoupon(String userCouponId);
	
	public abstract Timestamp useCoupon(IUserCoupon iUserCoupon);
	
}
