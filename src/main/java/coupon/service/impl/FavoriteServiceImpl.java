package coupon.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import coupon.bean.ShopBean;
import coupon.dao.IUserFavoriteDao;
import coupon.entity.IUserFavorite;
import coupon.service.FavoriteService;
import coupon.service.ShopService;
import coupon.util.CouponDateUtils;

public class FavoriteServiceImpl implements FavoriteService {

	@Resource
	protected IUserFavoriteDao iUserFavoriteDao;
	@Resource
	protected ShopService shopService;
	
	
	@Override
	public List<ShopBean> getFavoriteShops(Long userId) {
		List<ShopBean> shopBeans = new ArrayList<ShopBean>();
		List<IUserFavorite> favoriteList = iUserFavoriteDao.findByUserIdOrderByInsDatetime(userId);
		for (IUserFavorite iUserFavorite : favoriteList) {
			ShopBean shopBaen = shopService.getShopBean(iUserFavorite.shopId);
			shopBeans.add(shopBaen);
		}
		return shopBeans;
	}

	@Override
	public void deleteFavorite(Long userId, Integer shopId) {
		
		IUserFavorite entity = new IUserFavorite();
		entity.userId = userId;
		entity.shopId = shopId;
		iUserFavoriteDao.delete(entity);
	}

	@Override
	public void insertFavorite(Long userId, Integer shopId) {
		IUserFavorite record = new IUserFavorite();
		record.userId = userId;
		record.shopId = shopId;
		record.insDatetime = CouponDateUtils.getCurrentDate();
		iUserFavoriteDao.insert(record);
	}

	@Override
	public IUserFavorite getIUserFavorite(Long userId, Integer shopId) {
		return iUserFavoriteDao.findById(userId, shopId);
	}

}
