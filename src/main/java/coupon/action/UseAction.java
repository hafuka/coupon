package coupon.action;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.seasar.struts.annotation.Execute;

import coupon.entity.IUserCoupon;
import coupon.service.CouponService;

/**
 * チケット使用アクション
 */
public class UseAction extends BaseAction {

	@Resource
	protected CouponService couponService;
	
	public String userCouponId;
	
	@Execute(validator=false)
	public String index() {
		
		if (StringUtils.isEmpty(userCouponId)) {
			throw new IllegalArgumentException("userCouponId is null.");
		}
		
		IUserCoupon iUserCoupon = couponService.getIUserCoupon(userCouponId);
		if (iUserCoupon == null) {
			throw new IllegalArgumentException("IUserCoupon is null. userCouponId=" + userCouponId);
		}
		
		return "use.ftl";
	}
}
