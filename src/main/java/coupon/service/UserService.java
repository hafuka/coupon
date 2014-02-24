package coupon.service;

import java.util.List;

import coupon.entity.IUser;
import coupon.entity.IUserAuthentication;
import coupon.entity.IUserCoin;
import coupon.entity.IUserCoupon;
import coupon.entity.MShopCoupon;


/**
 * ユーザーサービス
 *
 */
public interface UserService {


	/**
	 * ログイン判定
	 * @param email
	 * @param password
	 * @return
	 */
	public abstract boolean checkLogin(String email, String password) throws Exception;

	/**
	 * ユーザー情報新規登録
	 * @param email
	 * @param password
	 * @param name
	 */
	public abstract IUser registUser(String email, String password, String name, String confToken) throws Exception;

	public abstract IUser getIUser(Long userId);

	public abstract IUserAuthentication getIUserAuth(String email, String password) throws Exception;

	public abstract IUserAuthentication getIUserAuth(String registToken);

	public abstract void updateIUser(IUser iUser);

	public abstract List<IUserCoupon> getIUserCoupons(Long userId);

	public abstract IUserCoupon getIUserCoupon(Long userId, MShopCoupon mShopCoupon);

	public abstract void insertIUserCoupon(Long userId, MShopCoupon mShopCoupon);

	public abstract void updateIUserCoupon(IUserCoupon iUserCoupon);

	public abstract boolean checkExistsEmail(String email);

	public abstract void updateIUserAuthentication(IUserAuthentication iUserAuthentication);

	public abstract IUserCoin getIUserCoin(Long userId);

	public abstract void useCoin(Long userId, Integer useCoin);
	
	public abstract void usePoint(Long userId, Integer usePoint);



}
