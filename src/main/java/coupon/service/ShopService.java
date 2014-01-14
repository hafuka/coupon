package coupon.service;

import java.util.List;

import coupon.entity.MShop;
import coupon.entity.MShopCoupon;

public interface ShopService {

	/**
	 * ショップ検索
	 * @param areaId
	 * @param areaDetailId
	 * @param premiumFlg
	 * @return
	 */
	public abstract List<MShop> getMShops(Integer areaId, Integer areaDetailId, boolean premiumFlg);
	
	
	
	public abstract List<MShopCoupon> getMShopCoupons(Integer shopId, boolean premiumFlg);
}
