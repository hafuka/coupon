package coupon.action;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.bean.ShopBean;
import coupon.service.ShopService;

/**
 * ショップ検索
 */
public class ShopSearchAction extends BaseAction {
	
	@Resource
	protected ShopService shopService;
	
	public String searchValue;
	
	public List<ShopBean> shopList;
	
	@Execute(validator=false)
	public String index() {
		shopList = shopService.getShopBaens(null, null, null);
		return "shop_search.ftl";
	}
	
	@Execute(validator=false)
	public String search() throws IOException {
		List<ShopBean> shopList = shopService.getShopBeans(searchValue);
		super.setJsonData(shopList);
		return null;
	}
}
