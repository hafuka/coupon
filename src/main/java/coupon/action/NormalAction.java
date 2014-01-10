package coupon.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts.util.LabelValueBean;
import org.seasar.struts.annotation.Execute;

import coupon.entity.MShop;
import coupon.service.PullDownService;
import coupon.service.ShopService;

public class NormalAction extends BaseAction {
	
	@Resource
	protected PullDownService pullDownService;
	
	public Integer area;
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
		shopList = shopService.getMShops(false);
		areaList = pullDownService.getAreaList();
		areaDetailList = pullDownService.getAreaDetailList(14);
		businessList = pullDownService.getBusinessList();
        return "/normal/normal.ftl";
	}
	
	
	@Execute(validator=false)
	public Map<String, Object> search() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("test", "test");
		return map;
	}
}
