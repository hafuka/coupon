package coupon.service;

import coupon.entity.IUser;

public interface DailyProcessService {

	
	
	/**
	 * 日時処理
	 * @param userId
	 */
	public abstract void doDailyProcess(IUser iUser);
}
