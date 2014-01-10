package coupon.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.BeanMap;

import coupon.dao.MShopDao;
import coupon.entity.MShop;
import coupon.entity.MShopNames;
import coupon.service.ShopService;

public class ShopServiceImpl implements ShopService {

	@Resource
	protected MShopDao mShopDao;
	
	@Override
	public List<MShop> getMShops(boolean premiumFlg) {
		if (premiumFlg) {
			BeanMap conditions = new BeanMap();
			conditions.put(MShopNames.premiumFlg().toString(), true);
			return mShopDao.findByCondition(conditions);
		} else {
			BeanMap conditions = new BeanMap();
			conditions.put(MShopNames.premiumFlg().toString(), null);
			return mShopDao.findByCondition(conditions);
		}
	}

	@Override
	public List<MShop> getMShops(Integer areaId, Integer areaDetailId, boolean premiumFlg) {
		if (premiumFlg) {
			BeanMap conditions = new BeanMap();
			conditions.put(MShopNames.areaId().toString(), areaId);
			conditions.put(MShopNames.areaDetailId().toString(), areaDetailId);
			conditions.put(MShopNames.premiumFlg().toString(), true);
			return mShopDao.findByCondition(conditions);
		} else {
			BeanMap conditions = new BeanMap();
			conditions.put(MShopNames.areaId().toString(), areaId);
			conditions.put(MShopNames.areaDetailId().toString(), areaDetailId);
			conditions.put(MShopNames.premiumFlg().toString(), null);
			return mShopDao.findByCondition(conditions);
		}
	}

}
