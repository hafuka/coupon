package coupon.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.MShop;
import coupon.service.ShopService;

public class PremiumAction {

	public List<MShop> shopList;

	@Resource
	protected ShopService shopService;
	
	@Execute(validator = false)
	public String index() {
		shopList = shopService.getMShops(true);
        return "/premium/premium.ftl";
	}
}
