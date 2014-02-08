package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.bean.ShopBaen;
import coupon.entity.IUserCoin;
import coupon.service.ShopService;
import coupon.service.UserService;

public class DetailAction extends BaseAction {

	@Resource
	protected ShopService shopService;
	@Resource
	protected UserService userService;

	/***** IN項目 *****/
	public Integer shopId;

	/***** OUT 項目 *****/
	public ShopBaen shop;
	public Integer coin;


	@Execute(validator=false)
	public String index() {

		if (shopId == null) {
			throw new IllegalArgumentException("shopIdがnullです");
		}
		shop = shopService.getMShop(shopId);
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
