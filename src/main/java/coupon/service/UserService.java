package coupon.service;

import coupon.entity.IUser;
import coupon.entity.IUserAuthentication;

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

	public abstract boolean checkExistsEmail(String email);

	public abstract void updateIUserAuthentication(IUserAuthentication iUserAuthentication);

	public abstract void usePoint(Long userId, Integer usePoint);

	public abstract String generateCookieValue(Long userId) throws Exception;

}
