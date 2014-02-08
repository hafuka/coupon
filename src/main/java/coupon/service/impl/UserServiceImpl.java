package coupon.service.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.seasar.framework.beans.util.BeanMap;

import coupon.dao.IUserAuthenticationDao;
import coupon.dao.IUserCoinDao;
import coupon.dao.IUserCouponDao;
import coupon.dao.IUserDao;
import coupon.entity.IUser;
import coupon.entity.IUserAuthentication;
import coupon.entity.IUserAuthenticationNames;
import coupon.entity.IUserCoin;
import coupon.entity.IUserCoupon;
import coupon.entity.IUserNames;
import coupon.entity.MShopCoupon;
import coupon.service.UserService;
import coupon.util.CouponDateUtils;
import coupon.util.CryptUtils;

public class UserServiceImpl implements UserService {

	@Resource
	protected IUserDao iUserDao;
	@Resource
	protected IUserAuthenticationDao iUserAuthenticationDao;
	@Resource
	protected IUserCouponDao iUserCouponDao;
	@Resource
	protected IUserCoinDao iUserCoinDao;

	@Override
	public boolean checkLogin(String email, String password) throws Exception {
		Long count = iUserAuthenticationDao.countByEmailAndPassword(email, password);
		if (count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public IUser registUser(String email, String password, String name, String confToken) throws Exception {

		Timestamp nowDate = CouponDateUtils.getCurrentDate();

		// IUserの登録
		Long userId = iUserDao.getCount() + 1;
		IUser iUser = new IUser();
		iUser.userId = userId;
		iUser.email = email;
		iUser.name = name;
		iUser.point = 0L;
		iUser.insDatetime = nowDate;
		iUser.updDatetime = nowDate;
		iUserDao.insert(iUser);

		IUserAuthentication iUserAuthentication = new IUserAuthentication();
		iUserAuthentication.userId = userId;
		iUserAuthentication.email = email;
		iUserAuthentication.password = CryptUtils.encrypt(password);
		iUserAuthentication.registToken = confToken;
		iUserAuthentication.insDatetime = nowDate;
		iUserAuthentication.updDatetime = nowDate;
		iUserAuthenticationDao.insert(iUserAuthentication);

		return iUser;
	}

	@Override
	public IUser getIUser(Long userId) {
		return iUserDao.findById(userId);
	}

	@Override
	public IUserAuthentication getIUserAuth(String email, String password) throws Exception {
		String encPassword = CryptUtils.encrypt(password);

		BeanMap map = new BeanMap();
		map.put(IUserAuthenticationNames.email().toString(), email);
		map.put(IUserAuthenticationNames.password().toString(), encPassword);

		List<IUserAuthentication> iUserAuthList = iUserAuthenticationDao.findByCondition(map);

		if (CollectionUtils.isEmpty(iUserAuthList)) {
			return null;
		}
		return iUserAuthList.get(0);
	}

	@Override
	public void updateIUser(IUser iUser) {
		iUserDao.update(iUser);
	}

	@Override
	public IUserCoupon getIUserCoupon(Long userId, MShopCoupon mShopCoupon) {
		return iUserCouponDao.findById(userId, mShopCoupon.shopId, mShopCoupon.couponId);
	}

	@Override
	public void insertIUserCoupon(Long userId, MShopCoupon mShopCoupon) {

		Timestamp nowDate = CouponDateUtils.getCurrentDate();

		IUserCoupon record = new IUserCoupon();
		record.userId = userId;
		record.shopId = mShopCoupon.shopId;
		record.couponId = mShopCoupon.couponId;
		record.couponCount = 1;
		record.limitDatetime = CouponDateUtils.add(nowDate, mShopCoupon.limitDays, Calendar.DATE);

		record.updDatetime = nowDate;
		record.insDatetime = nowDate;

		iUserCouponDao.insert(record);
	}

	@Override
	public void updateIUserCoupon(IUserCoupon iUserCoupon) {
		iUserCouponDao.update(iUserCoupon);
	}

	@Override
	public boolean checkExistsEmail(String email) {
		BeanMap conditions = new BeanMap();
		conditions.put(IUserNames.email().toString(), email);
		List<IUser> userList = iUserDao.findByCondition(conditions);

		if (CollectionUtils.isEmpty(userList)) {
			return false;
		}
		return true;
	}

	@Override
	public IUserAuthentication getIUserAuth(String registToken) {
		BeanMap conditions = new BeanMap();
		conditions.put(IUserAuthenticationNames.registToken().toString(), registToken);
		List<IUserAuthentication> list = iUserAuthenticationDao.findByCondition(conditions);
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public void updateIUserAuthentication(IUserAuthentication iUserAuthentication) {
		iUserAuthenticationDao.update(iUserAuthentication);
	}

	@Override
	public IUserCoin getIUserCoin(Long userId) {
		return iUserCoinDao.findById(userId);
	}

	@Override
	public void useCoin(Long userId, Integer useCoin) {

		Timestamp nowDate = CouponDateUtils.getCurrentDate();

		IUserCoin userCoin = this.getIUserCoin(userId);
		int updCoin = userCoin.coin - useCoin;
		if (updCoin < 0) {
			updCoin = 0;
		}
		userCoin.coin = updCoin;
		userCoin.updDatetime = nowDate;

		iUserCoinDao.update(userCoin);
	}
}
