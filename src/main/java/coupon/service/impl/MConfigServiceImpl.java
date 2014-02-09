package coupon.service.impl;

import javax.annotation.Resource;

import coupon.dao.MConfigDao;
import coupon.entity.MConfig;
import coupon.enums.MConfigKey;
import coupon.service.MConfigService;

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

}
