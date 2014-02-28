package coupon.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.struts.util.LabelValueBean;
import org.seasar.struts.annotation.Execute;

import coupon.bean.ShopBean;
import coupon.dto.CouponDto;
import coupon.entity.IUserCoupon;
import coupon.entity.MShopCoupon;
import coupon.service.CouponService;
import coupon.service.PullDownService;
import coupon.service.ShopService;

public class BoxAction extends BaseAction {
	@Resource
	protected CouponService couponService;
	@Resource
	protected ShopService shopService;
	@Resource
	protected PullDownService pullDownService;
	
	public List<CouponDto> couponList;
	
	public List<LabelValueBean> rarityList;
	
	public Integer rarity;
	
	@Execute(validator = false)
	public String index() {
		
		rarityList = pullDownService.getRarityList();
		
		List<IUserCoupon> userCouponList = couponService.getIUserCoupons(loginUserDto.userId);
		if (!CollectionUtils.isEmpty(userCouponList)) {
			
			couponList = new ArrayList<CouponDto>(userCouponList.size());
			for (IUserCoupon userCoupon : userCouponList) {
				
				ShopBean shopBean = shopService.getShopBean(userCoupon.shopId);
				MShopCoupon mShopCoupon = shopService.getMShopCoupon(userCoupon.shopId, userCoupon.couponId);
				CouponDto couponDto = new CouponDto();
				couponDto.shopBean = shopBean;
				couponDto.mShopCoupon = mShopCoupon;
				couponDto.userCoupon = userCoupon;
				couponList.add(couponDto);
			}
		}
        return "/box/box.ftl";
	}
	
	
	
	@Execute(validator=false)
	public String changeRarity() throws IOException {
		if (rarity == 0) {
			rarity = null;
		}
		
		List<IUserCoupon> userCouponList = couponService.getIUserCoupons(loginUserDto.userId);
		
		List<CouponDto> couponList = new ArrayList<CouponDto>(userCouponList.size());
		
		if (!CollectionUtils.isEmpty(userCouponList)) {
			for (IUserCoupon userCoupon : userCouponList) {
				ShopBean shopBean = shopService.getShopBean(userCoupon.shopId);
				MShopCoupon mShopCoupon = shopService.getMShopCoupon(userCoupon.shopId, userCoupon.couponId);
				
				if (rarity != null && mShopCoupon.rarity.equals(rarity)) {
					CouponDto couponDto = new CouponDto();
					couponDto.shopBean = shopBean;
					couponDto.mShopCoupon = mShopCoupon;
					couponDto.userCoupon = userCoupon;
					couponList.add(couponDto);
				}
			}
		}
		super.setJsonData(couponList);
		return null;
	}
}
