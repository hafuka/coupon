package coupon.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.BeanUtil;

import coupon.bean.ShopBaen;
import coupon.dto.CouponDto;
import coupon.entity.IUser;
import coupon.entity.IUserCoupon;
import coupon.entity.MShopCoupon;
import coupon.enums.MConfigKey;
import coupon.enums.RarityType;
import coupon.service.MConfigService;
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
	protected MConfigService mConfigService;

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
	public CouponDto execRoulette(Long userId, boolean premiumFlg, Integer areaId, Integer areaDetailId, Integer businessId) {

		Timestamp nowDate = CouponDateUtils.getCurrentDate();

		// お店リスト取得
		List<ShopBaen> shopList = shopService.getMShops(areaId, areaDetailId, businessId);
		Collections.shuffle(shopList);
		ShopBaen shopBean = shopList.get(0);

		// ショップクーポンを抽出する
		MShopCoupon shopCoupon = this.getRandomCoupon(shopBean.shopId, false);

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
		couponDto.shopBean = shopBean;
		couponDto.mShopCoupon = shopCoupon;

		// スロットの止まる位置情報取得
		couponDto.positionList = this.getStopPositionList(shopCoupon);

		int chance = MathUtils.getRandomRange(1, 100);
		if (chance > 50) {
			couponDto.chanceFlg = true;
		}

		return couponDto;
	}

	@Override
	public CouponDto execPremiumRoulette(Long userId, Integer shopId, Long userPoint) {

		// お店リスト取得
		ShopBaen shopBean = shopService.getMShop(shopId);
		if (shopBean == null) {
			throw new IllegalArgumentException("お店情報取得エラー。shopId=" + shopId);
		}

		// ショップクーポンを抽出する
		MShopCoupon shopCoupon = this.getRandomCoupon(shopBean.shopId, true);
		// クーポン付与
		this.addCoupon(userId, shopCoupon);
		
		
		int oneTimeCoin = Integer.parseInt(mConfigService.getConfigValue(MConfigKey.ONE_TIME_COIN));
		int oneTimePoint = Integer.parseInt(mConfigService.getConfigValue(MConfigKey.ONE_TIME_POINT));
		
		if (userPoint >= oneTimePoint) {
			userService.usePoint(userId, oneTimePoint);
		} else {
			// コイン消費
			userService.useCoin(userId, oneTimeCoin);
		}

		CouponDto couponDto = new CouponDto();
		couponDto.shopBean = shopBean;
		couponDto.mShopCoupon = shopCoupon;

		// スロットの止まる位置情報取得
		couponDto.positionList = this.getStopPositionList(shopCoupon);

		int chance = MathUtils.getRandomRange(1, 100);
		if (chance > 50) {
			couponDto.chanceFlg = true;
		}

		return couponDto;
	}

    private MShopCoupon getRandomCoupon(Integer shopId, boolean premiumFlg) {

    	// お店のクーポンリスト取得
		List<MShopCoupon> shopCouponList = shopService.getMShopCoupons(shopId);

		if (premiumFlg) {

		}
		List<MShopCoupon> tempShopCouponList = new ArrayList<MShopCoupon>(shopCouponList.size());
		for (MShopCoupon mShopCoupon : shopCouponList) {
			MShopCoupon tempCoupon = new MShopCoupon();
			BeanUtil.copyProperties(mShopCoupon, tempCoupon);

			// プレミアムでかつ、SRの場合確率アップ
			if (premiumFlg && RarityType.getEnum(mShopCoupon.rarity).equals(RarityType.SR)) {
				// SR発生確率5%アップ
				tempCoupon.probability = tempCoupon.probability + 5;
			}
			tempShopCouponList.add(tempCoupon);
		}

        int sumProbability = getSumProbability(tempShopCouponList);
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
		case N:
			positionResultList.add(positionList.get(0));
			break;
		case R:
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

	private void addCoupon(Long userId, MShopCoupon shopCoupon) {

		Timestamp nowDate = CouponDateUtils.getCurrentDate();

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
	}

}
