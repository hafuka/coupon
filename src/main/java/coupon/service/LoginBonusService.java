package coupon.service;

import coupon.entity.MLoginBonus;

public interface LoginBonusService {

	/**
	 * ログインボーナスチェック
	 * @param userId
	 * @return
	 */
	public abstract boolean isLoginBonus(Long userId);
	
	/**
	 * ログインボーナス付与処理
	 * @param userId
	 */
	public abstract MLoginBonus sendLoginBonus(Long userId);
}
