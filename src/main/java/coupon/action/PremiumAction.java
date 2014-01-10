package coupon.action;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts.util.LabelValueBean;
import org.seasar.struts.annotation.Execute;

import coupon.entity.MShop;
import coupon.service.PullDownService;
import coupon.service.ShopService;

public class PremiumAction extends BaseAction {

	@Resource
	protected PullDownService pullDownService;
	
	public Integer areaId;
	public Integer areaDetailId;
	
	public List<MShop> shopList;
	
	public List<LabelValueBean> areaList;
	public List<LabelValueBean> areaDetailList;
	public List<LabelValueBean> businessList;

	/**
	 * 初期表示
	 */
	@Resource
	protected ShopService shopService;
	
	@Execute(validator = false)
	public String index() {
		shopList = shopService.getMShops(null, null, true);
		Collections.shuffle(shopList);
		areaList = pullDownService.getAreaList();
		areaDetailList = pullDownService.getAreaDetailList(14);
		businessList = pullDownService.getBusinessList();
        return "/normal/normal.ftl";
	}
	
	/**
	 * 検索処理(ajax)
	 * @return
	 * @throws IOException
	 */
	@Execute(validator = false)
	public String search() throws IOException {
		shopList = shopService.getMShops(areaId, areaDetailId, true);
        super.setJsonData(shopList);
		return null;
	}
}
