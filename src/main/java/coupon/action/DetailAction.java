package coupon.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.bean.ShopBean;
import coupon.entity.IUserCoin;
import coupon.entity.IUserFavorite;
import coupon.entity.MShopCoupon;
import coupon.service.FavoriteService;
import coupon.service.ShopService;
import coupon.service.UserService;

public class DetailAction extends BaseAction {

	@Resource
	protected ShopService shopService;
	@Resource
	protected UserService userService;
	@Resource
	protected FavoriteService favoriteService;

	/***** IN項目 *****/
	public Integer shopId;

	/***** OUT 項目 *****/
	public ShopBean shop;
	public List<MShopCoupon> couponList;
	public Integer coin;


	@Execute(validator=false)
	public String index() {

		if (shopId == null) {
			throw new IllegalArgumentException("shopIdがnullです");
		}
		shop = shopService.getShopBean(shopId);
		couponList = shopService.getMShopCoupons(shopId);
		
		IUserFavorite userFavorite = favoriteService.getIUserFavorite(loginUserDto.userId, shopId);
		if (userFavorite != null) {
			shop.isFavorite = true;
		}
		
		if (shop == null) {
			throw new IllegalArgumentException("shopが存在しません。shopId=" + shopId);
		}

		IUserCoin userCoin = userService.getIUserCoin(loginUserDto.userId);
		if (userCoin == null || userCoin.coin == null) {
			this.coin = 0;
		} else {
			this.coin = userCoin.coin;
		}

		super.getFormToken();

		return "/detail/detail.ftl";
	}
}
