package coupon.service;

import java.util.List;

import coupon.entity.MShop;
import coupon.entity.MShopCoupon;

public interface ShopService {
	
	/**
	 * ショップ取得
	 * @param shopId
	 * @return
	 */
	public abstract MShop getMShop(Integer shopId);
	
	
	/**
	 * ショップ検索
	 * @param areaId
	 * @param areaDetailId
	 * @param premiumFlg
	 * @return
	 */
	public abstract List<MShop> getMShops(Integer areaId, Integer areaDetailId, Integer businessId);
	
	
	
	public abstract List<MShopCoupon> getMShopCoupons(Integer shopId, boolean premiumFlg);
}
