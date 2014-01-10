package coupon.service.impl;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;

import coupon.dao.MConfigDao;
import coupon.dao.MLoginBonusDao;
import coupon.dto.LoginUserDto;
import coupon.entity.IUser;
import coupon.entity.MConfig;
import coupon.entity.MLoginBonus;
import coupon.enums.LoginBonusType;
import coupon.enums.MConfigName;
import coupon.service.LoginBonusService;
import coupon.service.UserService;
import coupon.util.CouponDateUtils;

public class LoginBonusServiceImpl implements LoginBonusService {

	@Resource
	protected UserService userService;
	@Resource
	protected MConfigDao mConfigDao;
	@Resource
	protected MLoginBonusDao mLoginBonusDao;
	
	@Resource
	protected LoginUserDto loginUserDto;
	
	
	@Override
	public boolean isLoginBonus(Long userId) {
		
		MLoginBonus mLoginBonus = this.getLoginBonus(LoginBonusType.BASIC);
		if (mLoginBonus == null) {
			return false;
		}
		
		IUser iUser = userService.getIUser(userId);
		
		Timestamp sendLoginBonusTime = iUser.loginBonusDatetime;

        // ログインボーナス付与日時に値が入っていない
        if (sendLoginBonusTime == null) {
            // 初ログインボーナス付与
            return true;
        }

        Timestamp now = CouponDateUtils.getCurrentDate();
        MConfig mConfig = mConfigDao.findById(MConfigName.LOGIN_BONUS_TIME.getKey());
        String hhmm = mConfig.value;
        String zerosuppressHH = StringUtils.removeStart(StringUtils.substringBefore(hhmm, ":"), "0");
        String zerosuppressMm = StringUtils.removeStart(StringUtils.substringAfterLast(hhmm, ":"), "0");
        Timestamp todayLoginBonusDate = CouponDateUtils.getDateWithSpecifiedHourAndMinute(now, Integer.valueOf(zerosuppressHH), Integer.valueOf(zerosuppressMm));
        Timestamp yesterdayLoginBonusDate = CouponDateUtils.getDateWithSpecifiedHourAndMinute(CouponDateUtils.getPastDate(1), Integer.valueOf(zerosuppressHH), Integer.valueOf(zerosuppressMm));

        // 付与時刻以降(付与時刻含む）の場合、本日の付与時刻から現在までにボーナス付与を受けていない→ボーナス確定
        // 付与時刻以前の場合、前日の付与時刻から現在までにボーナス付与を受けていない→ボーナス確定
        return ((now.compareTo(todayLoginBonusDate) >= 0 && sendLoginBonusTime.before(todayLoginBonusDate)) ||
        		(now.before(todayLoginBonusDate) && sendLoginBonusTime.before(yesterdayLoginBonusDate)));
	}


	@Override
	public MLoginBonus sendLoginBonus(Long userId) {
		
		MLoginBonus mLoginBonus = this.getLoginBonus(LoginBonusType.BASIC);
		
		if (mLoginBonus != null) {
			
			Timestamp nowDate = CouponDateUtils.getCurrentDate();
			
			IUser iUser = userService.getIUser(userId);
			Long userPoint = iUser.point;
			userPoint += mLoginBonus.point;
			iUser.point = userPoint;
			iUser.loginBonusDatetime = nowDate;
			iUser.updDatetime = nowDate;
			userService.updateIUser(iUser);
			
			loginUserDto.point = userPoint;
		}
		
		return mLoginBonus;
	}
	
	
	private MLoginBonus getLoginBonus(LoginBonusType type) {
		return mLoginBonusDao.findById(type.getKey());
	}
}
