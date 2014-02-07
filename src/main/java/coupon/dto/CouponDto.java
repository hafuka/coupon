package coupon.dto;

import java.io.Serializable;
import java.util.List;

import coupon.bean.ShopBaen;
import coupon.entity.MShopCoupon;

public class CouponDto implements Serializable {
	public ShopBaen mShop;
	public MShopCoupon mShopCoupon;
	public List<String> positionList;
	public boolean chanceFlg;
}
