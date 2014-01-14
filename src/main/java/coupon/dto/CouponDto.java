package coupon.dto;

import java.io.Serializable;

import coupon.entity.MShop;
import coupon.entity.MShopCoupon;

public class CouponDto implements Serializable {
	public MShop mShop;
	public MShopCoupon mShopCoupon;
}
