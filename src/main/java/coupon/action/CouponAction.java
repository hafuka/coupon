package coupon.action;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.util.LabelValueBean;
import org.seasar.struts.annotation.Execute;

import coupon.bean.ShopBean;
import coupon.entity.IUser;
import coupon.entity.IUserCoupon;
import coupon.enums.UserCouponStatus;
import coupon.service.CouponService;
import coupon.service.PullDownService;
import coupon.service.ShopService;
import coupon.service.UserService;
import coupon.util.CouponDateUtils;

/**
 * クーポン
 */
public class CouponAction extends BaseAction {

	@Resource
	protected CouponService couponService;
	@Resource
	protected ShopService shopService;
	@Resource
	protected PullDownService pullDownService;
	@Resource
	protected UserService userService;

	/** IN項目 */
	public String userCouponId;
	public Integer year;
	public Integer sex;

	/** OUT項目 */
	public IUserCoupon userCoupon;
	public ShopBean shopBean;
	public String remainTime;
	public List<LabelValueBean> yearList;
	public List<LabelValueBean> sexList;
	/** 初回ルーレット実行フラグ */
	public boolean firstRouletteFlg;

	@Execute(validator=false)
	public String index() {

		if (StringUtils.isEmpty(userCouponId)) {
			throw new IllegalArgumentException("userCouponId is null.");
		}
		userCoupon = couponService.getIUserCoupon(userCouponId);
		if (userCoupon == null) {
			throw new IllegalArgumentException("userCoupon is null. userCouponId="+ userCouponId);
		}

		Date limitDate = CouponDateUtils.toDate(userCoupon.limitDatetime);
		if (!CouponDateUtils.isBefore(limitDate)) {
			throw new IllegalArgumentException("limitDatetime is before.");
		}

		shopBean = shopService.getShopBean(userCoupon.shopId);

		Long days = CouponDateUtils.getRemainDays(limitDate);
		Long hours = CouponDateUtils.getRemainHours(limitDate);
		Long minutes = CouponDateUtils.getRemainMinutes(limitDate);
		Long seconds = CouponDateUtils.getRemainSeconds(limitDate);

		if (days == null && hours == null && minutes == null && seconds == null) {
			throw new IllegalArgumentException("coupon limitDatetime error.");
		}

		if (days != null && days > 0L) {
			remainTime = days + "日" + String.format("%02d:%02d:%02d", hours, minutes, seconds);
		} else {
			remainTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		}
		IUser iUser = userService.getIUser(loginUserDto.userId);
		if (iUser.age == null || iUser.sex == null) {
			firstRouletteFlg = true;
			yearList = pullDownService.getYearList();
			sexList = pullDownService.getSexList();
		}

		return "coupon.ftl";
	}


	@Execute(validator = false)
	public String use() throws IOException {

		if (StringUtils.isEmpty(userCouponId)) {
			throw new IllegalArgumentException("userCouponId is null.");
		}
		userCoupon = couponService.getIUserCoupon(userCouponId);
		if (userCoupon == null) {
			throw new IllegalArgumentException("userCoupon is null. userCouponId="+ userCouponId);
		}
		if (userCoupon.status.equals(UserCouponStatus.USED.key)) {
			throw new IllegalArgumentException("This coupon is already used.");
		}

		Date limitDate = CouponDateUtils.toDate(userCoupon.limitDatetime);
		if (!CouponDateUtils.isBefore(limitDate)) {
			throw new IllegalArgumentException("limitDatetime is before.");
		}

		// クーポン使う処理
		Timestamp limitDatetime = couponService.useCoupon(userCoupon);
		Long days = CouponDateUtils.getRemainDays(limitDatetime);
		Long hours = CouponDateUtils.getRemainHours(limitDatetime);
		Long minutes = CouponDateUtils.getRemainMinutes(limitDatetime);
		Long seconds = CouponDateUtils.getRemainSeconds(limitDatetime);

		if (days == null && hours == null && minutes == null && seconds == null) {
			throw new IllegalArgumentException("coupon limitDatetime error.");
		}

		if (days != null && days > 0L) {
			remainTime = days + "日" + String.format("%02d:%02d:%02d", hours, minutes, seconds);
		} else {
			remainTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("remainTime", remainTime);
		map.put("limitDatetime", CouponDateUtils.toString(limitDatetime, CouponDateUtils.SLASH_YYYYMMDDHHMMSS));

		IUser iUser = userService.getIUser(loginUserDto.userId);
		if (year != null && sex != null) {
			iUser.age = year;
			iUser.sex = sex;
			userService.updateIUser(iUser);
		}

		super.setJsonData(map);
		return null;
	}
}
