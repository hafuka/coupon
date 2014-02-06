package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.bean.ShopBaen;
import coupon.entity.IUserCoin;
import coupon.service.RouletteService;
import coupon.service.ShopService;

public class DetailAction extends BaseAction {
	
	@Resource
	protected ShopService shopService;
	@Resource
	protected RouletteService rouletteService;
	
	/***** IN項目 *****/
	public Integer shopId;
	
	/***** OUT 項目 *****/
	public ShopBaen shop;
	public Long coin;
	
	
	@Execute(validator=false)
	public String index() {
		
		if (shopId == null) {
			throw new IllegalArgumentException("shopIdがnullです");
		}
		shop = shopService.getMShop(shopId);
		if (shop == null) {
			throw new IllegalArgumentException("shopが存在しません。shopId=" + shopId);
		}
		
		IUserCoin userCoin = rouletteService.getIUserCoin(loginUserDto.userId);
		if (userCoin == null || userCoin.coin == null) {
			this.coin = 0L;
		} else {
			this.coin = userCoin.coin;
		}
		
		super.getFormToken();
		
		return "/detail/detail.ftl";
	}
}
