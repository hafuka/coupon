package coupon.service.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;

import coupon.dao.IUserCouponDao;
import coupon.entity.IUserCoupon;
import coupon.entity.MShopCoupon;
import coupon.service.CouponService;
import coupon.util.CouponDateUtils;

public class CouponServiceImpl implements CouponService {

	@Resource
	protected IUserCouponDao iUserCouponDao;
	
	@Override
	public List<IUserCoupon> getIUserCoupons(Long userId) {
		List<IUserCoupon> userCoupons = iUserCouponDao.findByUserIdOrderByLimitDate(userId);
		if (CollectionUtils.isEmpty(userCoupons)) {
			return null;
		}
		return userCoupons;
	}
	
	@Override
	public void insertIUserCoupon(Long userId, MShopCoupon mShopCoupon) {

		Timestamp nowDate = CouponDateUtils.getCurrentDate();

		IUserCoupon record = new IUserCoupon();
		record.userCouponId = generateUserCouponId(userId);
		record.userId = userId;
		record.shopId = mShopCoupon.shopId;
		record.couponId = mShopCoupon.couponId;
		record.limitDatetime = CouponDateUtils.add(nowDate, mShopCoupon.limitDays, Calendar.DATE);
		record.name = mShopCoupon.couponName;
		record.description = mShopCoupon.description;
		record.updDatetime = nowDate;
		record.insDatetime = nowDate;

		iUserCouponDao.insert(record);
	}

	@Override
	public void updateIUserCoupon(IUserCoupon iUserCoupon) {
		iUserCouponDao.update(iUserCoupon);
	}
	
	@Override
	public String generateUserCouponId(long userId) {
        return Long.toString(userId) + "_" + Long.toString(System.nanoTime()) + "_" + Math.random();
    }

	@Override
	public IUserCoupon getIUserCoupon(String userCouponId) {
		return iUserCouponDao.findById(userCouponId);
	}

}
