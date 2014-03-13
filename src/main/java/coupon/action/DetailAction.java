package coupon.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.bean.ShopBean;
import coupon.entity.IUser;
import coupon.entity.IUserCoin;
import coupon.entity.IUserFavorite;
import coupon.entity.MShopCoupon;
import coupon.enums.MConfigKey;
import coupon.service.CoinService;
import coupon.service.FavoriteService;
import coupon.service.MConfigService;
import coupon.service.ShopService;
import coupon.service.UserService;

public class DetailAction extends BaseAction {

	@Resource
	protected ShopService shopService;
	@Resource
	protected CoinService coinService;
	@Resource
	protected FavoriteService favoriteService;
	@Resource
	protected UserService userService;
	@Resource
	protected MConfigService mConfigService;

	/***** IN項目 *****/
	public Integer shopId;

	/***** OUT 項目 *****/
	public ShopBean shop;
	public List<MShopCoupon> couponList;
	public Integer coin;
	public boolean execPointFlg;
	public Integer needPoint;
	public Long userPoint;

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

		IUserCoin userCoin = coinService.getIUserCoin(loginUserDto.userId);
		if (userCoin == null || userCoin.coin == null) {
			this.coin = 0;
		} else {
			this.coin = userCoin.coin;
		}

		IUser iUser = userService.getIUser(loginUserDto.userId);
		userPoint = iUser.point;
		needPoint = Integer.parseInt(mConfigService.getConfigValue(MConfigKey.ONE_TIME_POINT_PREMIUM));
		if (userPoint >= needPoint) {
			execPointFlg = true;
		}

		super.getFormToken();

		return "/detail/detail.ftl";
	}
}
