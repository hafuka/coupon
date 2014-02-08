package coupon.service.impl;

import javax.annotation.Resource;

import coupon.dao.MConfigDao;
import coupon.entity.MConfig;
import coupon.service.MConfigService;

public class MConfigServiceImpl implements MConfigService {

	@Resource
	protected MConfigDao mConfigDao;

	@Override
	public String getConfigValue(String configKey) {
		MConfig mConfig = mConfigDao.findById(configKey);
		if (mConfig == null) {
			throw new IllegalArgumentException("M_CONFIG取得エラー key="+configKey);
		}
		return mConfig.value;
	}

}
