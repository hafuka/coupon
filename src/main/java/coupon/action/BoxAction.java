package coupon.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.seasar.struts.annotation.Execute;

import coupon.bean.ShopBean;
import coupon.dto.CouponDto;
import coupon.entity.IUserCoupon;
import coupon.entity.MShopCoupon;
import coupon.service.ShopService;
import coupon.service.UserService;

public class BoxAction extends BaseAction {
	@Resource
	protected UserService userService;
	@Resource
	protected ShopService shopService;
	
	public List<CouponDto> couponList;
	
	@Execute(validator = false)
	public String index() {
		
		couponList = new ArrayList<>();
		
		List<IUserCoupon> userCouponList = userService.getIUserCoupons(loginUserDto.userId);
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
}
