package coupon.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import coupon.dao.IUserCoinDao;
import coupon.dto.CouponDto;
import coupon.entity.IUser;
import coupon.entity.IUserCoin;
import coupon.entity.IUserCoupon;
import coupon.entity.MShop;
import coupon.entity.MShopCoupon;
import coupon.enums.RarityType;
import coupon.service.RouletteService;
import coupon.service.ShopService;
import coupon.service.UserService;
import coupon.util.CouponDateUtils;
import coupon.util.MathUtils;

public class RouletteServiceImpl implements RouletteService {
	
	@Resource
	protected UserService userService;
	@Resource
	protected ShopService shopService;
	@Resource
	protected IUserCoinDao iUserCoinDao;
	
	
	@Override
	public boolean checkDailyRoulette(Long userId) {
		IUser iUser = userService.getIUser(userId);
		int diffDays = iUser.normalRouletteDatetime == null ? 1 : CouponDateUtils.diffDays(iUser.normalRouletteDatetime, CouponDateUtils.getCurrentDate());
		if (diffDays < 1) {
			return false;
		}
		return true;
	}

	@Override
	public CouponDto execRoulette(Long userId, boolean premiumFlg) {
		
		Timestamp nowDate = CouponDateUtils.getCurrentDate();
		
		// お店リスト取得
		List<MShop> shopList = shopService.getMShops(null, null, null, premiumFlg);
		Collections.shuffle(shopList);
		MShop mShop = shopList.get(0);
		
		// ショップクーポンを抽出する
		MShopCoupon shopCoupon = this.getRandomCoupon(mShop, premiumFlg);
		
		IUserCoupon userCoupon = userService.getIUserCoupon(userId, shopCoupon);
		if (userCoupon == null) {
			// 登録
			userService.insertIUserCoupon(userId, shopCoupon);
			
		} else {
			// 更新
			userCoupon.couponCount += 1;
			userCoupon.limitDatetime = CouponDateUtils.add(nowDate, shopCoupon.limitDays, Calendar.DATE);
			userCoupon.updDatetime = nowDate;
			userService.updateIUserCoupon(userCoupon);
		}
		
		IUser iUser = userService.getIUser(userId);
		iUser.normalRouletteDatetime = nowDate;
		iUser.updDatetime = nowDate;
		userService.updateIUser(iUser);
		
		CouponDto couponDto = new CouponDto();
		couponDto.mShop = mShop;
		couponDto.mShopCoupon = shopCoupon;
		
		// スロットの止まる位置情報取得
		couponDto.positionList = this.getStopPositionList(shopCoupon);
		
		int chance = MathUtils.getRandomRange(1, 100);
		if (chance > 50) {
			couponDto.chanceFlg = true;
		}
		
		return couponDto;
	}
	
    private MShopCoupon getRandomCoupon(MShop mShop, boolean premiumFlg) {
    	
    	// お店のクーポンリスト取得
		List<MShopCoupon> shopCouponList = shopService.getMShopCoupons(mShop.shopId, premiumFlg);
	
        int sumProbability = getSumProbability(shopCouponList);
        int random = MathUtils.getRandomRange(1, sumProbability);
        int lowPercent = 0;
        int highPercent = 0;
        MShopCoupon shopCoupon = null;

        for (MShopCoupon mShopCoupon: shopCouponList){
            highPercent += mShopCoupon.probability;
            if (lowPercent < random && random <= highPercent) {
            	shopCoupon = mShopCoupon;
                break;
            } else {
                lowPercent = highPercent;
            }
        }
        return shopCoupon;
    }
	
	private int getSumProbability(List<MShopCoupon> shopCouponList) {
		int sumPercent = 0;
		for (MShopCoupon mShopCoupon : shopCouponList) {
			sumPercent += mShopCoupon.probability;
		}
		return sumPercent;
	}
	
	
	private List<String> getStopPositionList(MShopCoupon mShopCoupon) {
		List<String> positionList = new ArrayList<String>(3);
		positionList.add("LEFT");
		positionList.add("CENTER");
		positionList.add("RIGHT");
		Collections.shuffle(positionList);
		
		List<String> positionResultList = new ArrayList<String>();
		
		RarityType rarityType = RarityType.getEnum(mShopCoupon.rarity);
		switch (rarityType) {
		case R:
			positionResultList.add(positionList.get(0));
			break;
		case HR:
			positionResultList.add(positionList.get(0));
			positionResultList.add(positionList.get(1));
			break;
		case SR:

			break;
		default:
			break;
		}
		return positionResultList;
	}

	@Override
	public IUserCoin getIUserTicket(Long userId) {
		return iUserCoinDao.findById(userId);
	}

}
