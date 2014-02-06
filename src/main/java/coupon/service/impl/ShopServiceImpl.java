package coupon.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.BeanMap;

import coupon.dao.MShopCouponDao;
import coupon.dao.MShopDao;
import coupon.entity.MShop;
import coupon.entity.MShopCoupon;
import coupon.entity.MShopCouponNames;
import coupon.entity.MShopNames;
import coupon.enums.CouponType;
import coupon.service.ShopService;

public class ShopServiceImpl implements ShopService {

	@Resource
	protected MShopDao mShopDao;
	@Resource
	protected MShopCouponDao mShopCouponDao;

	@Override
	public List<MShop> getMShops(Integer areaId, Integer areaDetailId, Integer businessId) {
		BeanMap conditions = new BeanMap();
		conditions.put(MShopNames.areaId().toString(), areaId);
		conditions.put(MShopNames.areaDetailId().toString(), areaDetailId);
		conditions.put(MShopNames.businessId().toString(), businessId);
		return mShopDao.findByCondition(conditions);
	}

	@Override
	public List<MShopCoupon> getMShopCoupons(Integer shopId, boolean premiumFlg) {
		
		CouponType couponType = CouponType.NORMAL;
		if (premiumFlg) {
			couponType = CouponType.PREMIUM;
		}
		
		BeanMap conditions = new BeanMap();
		conditions.put(MShopCouponNames.shopId().toString(), shopId);
		conditions.put(MShopCouponNames.couponType().toString(), couponType.getKey());
		return mShopCouponDao.findByCondition(conditions);
	}

	@Override
	public MShop getMShop(Integer shopId) {
		return mShopDao.findById(shopId);
	}

}
