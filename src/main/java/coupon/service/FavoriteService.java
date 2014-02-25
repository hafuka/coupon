package coupon.service;

import java.util.List;

import coupon.bean.ShopBean;
import coupon.entity.IUserFavorite;

public interface FavoriteService {

	/**
	 * お気に入りショップリスト取得
	 * @param userId
	 * @return
	 */
	public abstract List<ShopBean> getFavoriteShops(Long userId);
	
	/**
	 * お気に入り削除
	 * @param userId
	 * @param shopId
	 */
	public abstract void deleteFavorite(Long userId, Integer shopId);
	
	/**
	 * お気に入り登録
	 * @param userId
	 * @param shopId
	 */
	public abstract void insertFavorite(Long userId, Integer shopId);
	
	/**
	 * お気に入り店取得
	 * @param userId
	 * @param shopId
	 * @return
	 */
	public abstract IUserFavorite getIUserFavorite(Long userId, Integer shopId);
}
