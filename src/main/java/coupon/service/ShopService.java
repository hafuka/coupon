package coupon.service;

import java.util.List;

import coupon.bean.ShopBaen;
import coupon.entity.MShopCoupon;

public interface ShopService {
	
	/**
	 * ショップ取得
	 * @param shopId
	 * @return
	 */
	public abstract ShopBaen getMShop(Integer shopId);
	
	
	/**
	 * ショップ検索
	 * @param areaId
	 * @param areaDetailId
	 * @param premiumFlg
	 * @return
	 */
	public abstract List<ShopBaen> getMShops(Integer areaId, Integer areaDetailId, Integer businessId);
	
	
	
	public abstract List<MShopCoupon> getMShopCoupons(Integer shopId);
	
	
	public abstract MShopCoupon getMShopCoupon(Integer shopId, Integer couponId);
}
