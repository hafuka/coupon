package coupon.service.impl;

import javax.annotation.Resource;

import coupon.dao.MConfigDao;
import coupon.entity.MConfig;
import coupon.enums.MConfigKey;
import coupon.service.MConfigService;
import coupon.util.CouponDateUtils;

public class MConfigServiceImpl implements MConfigService {

	@Resource
	protected MConfigDao mConfigDao;

	@Override
	public String getConfigValue(MConfigKey key) {
		MConfig mConfig = mConfigDao.findById(key.key);
		if (mConfig == null) {
			throw new IllegalArgumentException("M_CONFIG取得エラー key="+key);
		}
		return mConfig.value;
	}

	@Override
	public MConfig getWebPayMaintenance() {
		MConfig mConfig = mConfigDao.findById(MConfigKey.WEB_PAY_MAINTENANCE.key);
		if (mConfig == null) {
			return null;
		}
		if (CouponDateUtils.isWithin(mConfig.startDatetime, mConfig.endDatetime)) {
			return mConfig;
		}
		return null;
	}

}
