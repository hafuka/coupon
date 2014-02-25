package coupon.dto;

import java.io.Serializable;
import java.util.List;

import coupon.bean.ShopBean;
import coupon.entity.IUserCoupon;
import coupon.entity.MShopCoupon;

public class CouponDto implements Serializable {
	public ShopBean shopBean;
	public MShopCoupon mShopCoupon;
	public List<String> positionList;
	public boolean chanceFlg;
	
	public IUserCoupon userCoupon;
}
