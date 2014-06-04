package coupon.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts.util.LabelValueBean;
import org.seasar.struts.annotation.Execute;

import coupon.bean.ShopBean;
import coupon.entity.IUser;
import coupon.enums.MConfigKey;
import coupon.service.MConfigService;
import coupon.service.PullDownService;
import coupon.service.RouletteService;
import coupon.service.ShopService;
import coupon.service.UserService;

public class SearchAction extends BaseAction {

	@Resource
	protected PullDownService pullDownService;
	@Resource
	protected RouletteService rouletteService;
	@Resource
	protected UserService userService;
	@Resource
	protected MConfigService mConfigService;

	////////// IN項目 /////////
	public Integer areaId;
	public Integer areaDetailId;
	public Integer businessId;

	///////// OUT項目 ////////
	public List<ShopBean> shopList;
	public List<LabelValueBean> areaList;
	public List<LabelValueBean> areaDetailList;
	public List<LabelValueBean> businessList;
	public boolean rouletteFlg;
	public boolean execPointFlg;
	public Integer needPoint;
	public Long userPoint;

	/**
	 * 初期表示
	 */
	@Resource
	protected ShopService shopService;

	@Execute(validator = false)
	public String index() {

		shopList = shopService.getShopBaens(null, null, null);
		Collections.shuffle(shopList);
		areaList = pullDownService.getAreaList();
		areaDetailList = pullDownService.getAreaDetailList();
		businessList = pullDownService.getBusinessList();

		IUser iUser = userService.getIUser(loginUserDto.userId);
		userPoint = iUser.point;
		rouletteFlg = rouletteService.checkDailyRoulette(iUser);
		needPoint = Integer.parseInt(mConfigService.getConfigValue(MConfigKey.ONE_TIME_POINT_NORMAL));
		if (userPoint >= needPoint) {
			execPointFlg = true;
		}

		super.getFormToken();
        return "/search/search.ftl";
	}

	/**
	 * 検索処理(ajax)
	 * @return
	 * @throws IOException
	 */
	@Execute(validator = false)
	public String search() throws IOException {
		this.checkParam();
		shopList = shopService.getShopBaens(areaId, areaDetailId, businessId);
        super.setJsonData(shopList);
		return null;
	}

	/**
	 *
	 * @return
	 * @throws IOException
	 */
	@Execute(validator = false)
	public String changeArea() throws IOException {
		areaDetailList = new ArrayList<LabelValueBean>();
		if (this.areaId != 0) {
			areaDetailList = pullDownService.getAreaDetailList(areaId);
		}
        super.setJsonData(areaDetailList);
		return null;
	}


	private void checkParam() {
		if (this.areaId == 0) {
			this.areaId = null;
		}
		if (this.areaDetailId == 0) {
			this.areaDetailId = null;
		}
		if (this.businessId == 0) {
			this.businessId = null;
		}
	}

}
