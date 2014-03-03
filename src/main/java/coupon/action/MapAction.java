package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.MShop;
import coupon.service.ShopService;

public class MapAction extends BaseAction {
	
	@Resource
	protected ShopService shopService;
	
	/** IN */
	public Integer shopId;
	
	/** OUT */
	public String address;
	
	@Execute(validator=false)
	public String index() {
		
		if (shopId == null) {
			throw new IllegalArgumentException("shopId is null.");
		}
		
		MShop mShop = shopService.getMShop(shopId);
		if (mShop == null) {
			throw new IllegalArgumentException("MShop is null. shopId="+shopId);
		}
		
		this.address = mShop.address;
		
		return "map.ftl";
	}
}
