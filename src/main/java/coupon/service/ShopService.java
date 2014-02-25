package coupon.service;

import java.util.List;

import coupon.bean.ShopBean;
import coupon.entity.MShopCoupon;

public interface ShopService {
	
	/**
	 * ショップ取得
	 * @param shopId
	 * @return
	 */
	public abstract ShopBean getShopBean(Integer shopId);
	
	
	/**
	 * ショップ検索
	 * @param areaId
	 * @param areaDetailId
	 * @param premiumFlg
	 * @return
	 */
	public abstract List<ShopBean> getShopBaens(Integer areaId, Integer areaDetailId, Integer businessId);
	
	
	
	public abstract List<MShopCoupon> getMShopCoupons(Integer shopId);
	
	
	public abstract MShopCoupon getMShopCoupon(Integer shopId, Integer couponId);
}
