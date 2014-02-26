package coupon.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.bean.ShopBean;
import coupon.entity.IUserFavorite;
import coupon.service.FavoriteService;

/**
 * お気に入り
 *
 */
public class FavoriteAction extends BaseAction {

	@Resource
	protected FavoriteService favoriteService;
	
	public List<ShopBean> shopList;
	
	/***** IN情報 *****/
	public Integer shopId;
	
	/***** OUT情報 *****/
	public String errorMsg;
	
	/**
	 * 一覧表示
	 * @return
	 */
	@Execute(validator=false)
	public String index() {
		shopList = favoriteService.getFavoriteShops(loginUserDto.userId);
		return "favorite.ftl";
	}
	
	/**
	 * お気に入り登録(AJAX)
	 * @return
	 * @throws IOException 
	 */
	@Execute(validator=false)
	public String regist() throws IOException {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		IUserFavorite userFavorite = favoriteService.getIUserFavorite(loginUserDto.userId, shopId);
		if (userFavorite != null) {
			result.put("result", false);
			super.setJsonData(result);
			return null;
		}
		
		// 登録処理
		favoriteService.insertFavorite(loginUserDto.userId, shopId);
		result.put("result", true);
		super.setJsonData(result);
		return null;
	}
	
	/**
	 * お気に入り削除(AJAX)
	 * @return
	 */
	@Execute(validator=false)
	public String delete() throws IOException {
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("result", true);
		
		favoriteService.deleteFavorite(loginUserDto.userId, shopId);
		super.setJsonData(result);
		return null;
	}
	
}
