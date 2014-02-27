package coupon.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.seasar.framework.beans.util.BeanMap;
import org.seasar.framework.beans.util.BeanUtil;

import coupon.bean.ShopBean;
import coupon.dao.MAreaDao;
import coupon.dao.MAreaDetailDao;
import coupon.dao.MBusinessDao;
import coupon.dao.MShopCouponDao;
import coupon.dao.MShopDao;
import coupon.entity.MArea;
import coupon.entity.MAreaDetail;
import coupon.entity.MBusiness;
import coupon.entity.MShop;
import coupon.entity.MShopCoupon;
import coupon.entity.MShopNames;
import coupon.enums.RarityType;
import coupon.service.ShopService;

public class ShopServiceImpl implements ShopService {

	@Resource
	protected MShopDao mShopDao;
	@Resource
	protected MShopCouponDao mShopCouponDao;
	@Resource
	protected MAreaDao mAreaDao;
	@Resource
	protected MAreaDetailDao mAreaDetailDao;
	@Resource
	protected MBusinessDao mBusinessDao;
	

	@Override
	public List<ShopBean> getShopBaens(Integer areaId, Integer areaDetailId, Integer businessId) {
		
		BeanMap conditions = new BeanMap();
		conditions.put(MShopNames.areaId().toString(), areaId);
		conditions.put(MShopNames.areaDetailId().toString(), areaDetailId);
		conditions.put(MShopNames.businessId().toString(), businessId);
		
		List<MShop> shopList = mShopDao.findByCondition(conditions);
		return this.convertShopBeans(shopList);
//		for (MShop mShop : shopList) {
//			
//			MArea area = mAreaDao.findById(mShop.areaId);
//			MAreaDetail areaDetail = mAreaDetailDao.findById(mShop.areaId, mShop.areaDetailId);
//			MBusiness business = mBusinessDao.findById(mShop.businessId);
//			
//			ShopBean bean = new ShopBean();
//			BeanUtil.copyProperties(mShop, bean);
//			bean.areaName = area.areaName;
//			bean.areaDetailName = areaDetail.detailName;
//			bean.businessName = business.name;
//			
//			List<MShopCoupon> couponList = this.getMShopCoupons(mShop.shopId);
//			for (MShopCoupon mShopCoupon : couponList) {
//				if (RarityType.isSR(mShopCoupon.rarity)) {
//					bean.featuredCoupon = mShopCoupon.couponName;
//					break;
//				}
//			}
//			shopBeans.add(bean);
//		}
//		
//		return shopBeans;
	}

	@Override
	public List<MShopCoupon> getMShopCoupons(Integer shopId) {
		return mShopCouponDao.findByShopIdOrderByRarity(shopId);
	}

	@Override
	public ShopBean getShopBean(Integer shopId) {
		
		MShop mShop = mShopDao.findById(shopId);
		MArea area = mAreaDao.findById(mShop.areaId);
		MAreaDetail areaDetail = mAreaDetailDao.findById(mShop.areaId, mShop.areaDetailId);
		MBusiness business = mBusinessDao.findById(mShop.businessId);
		
		ShopBean bean = new ShopBean();
		BeanUtil.copyProperties(mShop, bean);
		bean.areaName = area.areaName;
		bean.areaDetailName = areaDetail.detailName;
		bean.businessName = business.name;
		
		List<MShopCoupon> couponList = this.getMShopCoupons(mShop.shopId);
		for (MShopCoupon mShopCoupon : couponList) {
			if (RarityType.isSR(mShopCoupon.rarity)) {
				bean.featuredCoupon = mShopCoupon.couponName;
				break;
			}
		}
		return bean;
	}

	@Override
	public MShopCoupon getMShopCoupon(Integer shopId, Integer couponId) {
		return mShopCouponDao.findById(shopId, couponId);
	}

	@Override
	public List<ShopBean> getShopBeans(String searchValue) {
		searchValue = StringUtils.replace(searchValue, "　", " ");
		String[] searchValues = searchValue.split(" ");
		
		List<MShop> shopList = mShopDao.findLikeShopName(searchValues);
		return this.convertShopBeans(shopList);
	}
	
	private List<ShopBean> convertShopBeans(List<MShop> mShops) {
		List<ShopBean> shopBeans = new ArrayList<>(mShops.size());
		for (MShop mShop : mShops) {

			MArea area = mAreaDao.findById(mShop.areaId);
			MAreaDetail areaDetail = mAreaDetailDao.findById(mShop.areaId, mShop.areaDetailId);
			MBusiness business = mBusinessDao.findById(mShop.businessId);

			ShopBean bean = new ShopBean();
			BeanUtil.copyProperties(mShop, bean);
			bean.areaName = area.areaName;
			bean.areaDetailName = areaDetail.detailName;
			bean.businessName = business.name;

			List<MShopCoupon> couponList = this.getMShopCoupons(mShop.shopId);
			for (MShopCoupon mShopCoupon : couponList) {
				if (RarityType.isSR(mShopCoupon.rarity)) {
					bean.featuredCoupon = mShopCoupon.couponName;
					break;
				}
			}
			shopBeans.add(bean);
		}
		return shopBeans;
	}

}
