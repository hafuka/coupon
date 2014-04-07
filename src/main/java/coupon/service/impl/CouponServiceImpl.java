package coupon.service.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;

import coupon.dao.IUserCouponDao;
import coupon.entity.IUserCoupon;
import coupon.entity.MShopCoupon;
import coupon.enums.MConfigKey;
import coupon.enums.UserCouponStatus;
import coupon.service.CouponService;
import coupon.service.MConfigService;
import coupon.util.CouponDateUtils;

public class CouponServiceImpl implements CouponService {

	@Resource
	protected MConfigService mConfigService;
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

		// クーポン有効期限
		String couponLimitDays = mConfigService.getConfigValue(MConfigKey.COUPON_LIMIT_DAYS);

		IUserCoupon record = new IUserCoupon();
		record.userCouponId = generateUserCouponId(userId);
		record.userId = userId;
		record.shopId = mShopCoupon.shopId;
		record.couponId = mShopCoupon.couponId;
		record.limitDatetime = CouponDateUtils.add(nowDate, Integer.parseInt(couponLimitDays), Calendar.DATE);
		record.name = mShopCoupon.couponName;
		record.description = mShopCoupon.description;
		record.rarity = mShopCoupon.rarity;
		record.status = UserCouponStatus.INIT.key;
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

	@Override
	public Timestamp useCoupon(IUserCoupon iUserCoupon) {

		Timestamp nowDate = CouponDateUtils.getCurrentDate();

		// チケット残り時間を取得
		String limitTime = mConfigService.getConfigValue(MConfigKey.USE_COUPON_LIMIT_TIME);
		Timestamp limitDatetime = CouponDateUtils.add(nowDate, Integer.parseInt(limitTime), Calendar.HOUR);

		iUserCoupon.status = UserCouponStatus.USED.key;
		iUserCoupon.limitDatetime = limitDatetime;
		iUserCoupon.updDatetime = nowDate;
		iUserCouponDao.update(iUserCoupon);

		return limitDatetime;
	}

}
