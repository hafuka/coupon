package coupon.service;

import coupon.entity.MConfig;
import coupon.enums.MConfigKey;

public interface MConfigService {

	String getConfigValue(MConfigKey key);

	MConfig getWebPayMaintenance();

}
