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
	public abstract void registUser(String email, String password, String name) throws Exception;

	public abstract IUser getIUser(Long userId);

	public abstract IUserAuthentication getIUserAuth(String email, String password) throws Exception;
	
	
	public abstract void updateIUser(IUser iUser);

}
