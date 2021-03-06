package coupon.service;

import java.util.List;

import coupon.bean.ShopBean;
import coupon.entity.MShop;
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

	public abstract List<ShopBean> getShopBeans(String searchValue);

	public abstract MShop getMShop(Integer shopId);

	public abstract void registMShop(MShop mShop);

	public abstract void registMShopCoupon(MShopCoupon mShopCoupon);

	public abstract Integer findNextShopId();
}
