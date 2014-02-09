package coupon.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.IUserCoupon;
import coupon.service.UserService;

public class BoxAction extends BaseAction {
	@Resource
	protected UserService userService;

	public List<IUserCoupon> couponList;

	@Execute(validator = false)
	public String index() {
		couponList = userService.getIUserCoupons(loginUserDto.userId);
        return "/box/box.ftl";
	}
}
