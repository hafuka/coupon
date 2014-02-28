package coupon.action.admin;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.MShop;
import coupon.service.ShopService;

public class AdminBasicAction extends AdminBaseAction {

	@Resource
	protected ShopService shopService;

	public String shopName;
	public String description;
	public String url;
	public String address;
	public String tell;
	public String station;

	@Execute(validator = false)
	public String index() {
		
		shopService.getShopBean(loginAdminDto.shopId);
		
		return "admin_basic.ftl";
	}

	@Execute(validator = false)
	public String regist() {

		MShop mShop = new MShop();
		shopService.insertMShop(mShop);

		return "admin_basic.ftl";
	}
}
