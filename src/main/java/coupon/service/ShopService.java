package coupon.service;

import java.util.List;

import coupon.entity.MShop;

public interface ShopService {

	/**
	 * ショップ検索
	 * @param premiumFlg
	 * @return
	 */
	public abstract List<MShop> getMShops(boolean premiumFlg);
	
	
	/**
	 * ショップ検索
	 * @param areaId
	 * @param areaDetailId
	 * @param premiumFlg
	 * @return
	 */
	public abstract List<MShop> getMShops(Integer areaId, Integer areaDetailId, boolean premiumFlg);
}
