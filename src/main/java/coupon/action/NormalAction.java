package coupon.action;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts.util.LabelValueBean;
import org.seasar.struts.annotation.Execute;

import coupon.entity.MShop;
import coupon.service.PullDownService;
import coupon.service.RouletteService;
import coupon.service.ShopService;

public class NormalAction extends BaseAction {
	
	@Resource
	protected PullDownService pullDownService;
	@Resource
	protected RouletteService rouletteService;
	
	////////// IN項目 /////////
	public Integer areaId;
	public Integer areaDetailId;
	public Integer businessId;
	
	///////// OUT項目 ////////
	public List<MShop> shopList;
	public List<LabelValueBean> areaList;
	public List<LabelValueBean> areaDetailList;
	public List<LabelValueBean> businessList;
	public boolean rouletteFlg;

	/**
	 * 初期表示
	 */
	@Resource
	protected ShopService shopService;
	
	@Execute(validator = false)
	public String index() {
		shopList = shopService.getMShops(null, null, null);
		Collections.shuffle(shopList);
		areaList = pullDownService.getAreaList();
		areaDetailList = pullDownService.getAreaDetailList(14);
		businessList = pullDownService.getBusinessList();
		
		//rouletteFlg = rouletteService.checkDailyRoulette(loginUserDto.userId);
		
		rouletteFlg = true;
		
		super.getFormToken();
		
        return "/normal/normal.ftl";
	}
	
	/**
	 * 検索処理(ajax)
	 * @return
	 * @throws IOException
	 */
	@Execute(validator = false)
	public String search() throws IOException {
		shopList = shopService.getMShops(areaId, areaDetailId, businessId);
        super.setJsonData(shopList);
		return null;
	}
}
