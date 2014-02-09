package coupon.service;

import coupon.enums.MConfigKey;

public interface MConfigService {



	public abstract String getConfigValue(MConfigKey key);

}
