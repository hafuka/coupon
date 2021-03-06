package coupon.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.BeanUtil;

import coupon.bean.ShopBean;
import coupon.dto.CouponDto;
import coupon.entity.IUser;
import coupon.entity.MShopCoupon;
import coupon.enums.MConfigKey;
import coupon.enums.RarityType;
import coupon.service.CoinService;
import coupon.service.CouponService;
import coupon.service.MConfigService;
import coupon.service.RouletteService;
import coupon.service.ShopService;
import coupon.service.UserService;
import coupon.util.CouponActivityLogger;
import coupon.util.CouponDateUtils;
import coupon.util.MathUtils;

public class RouletteServiceImpl implements RouletteService {

	@Resource
	protected UserService userService;
	@Resource
	protected ShopService shopService;
	@Resource
	protected MConfigService mConfigService;
	@Resource
	protected CouponService couponService;
	@Resource
	protected CoinService coinService;

	@Override
	public boolean checkDailyRoulette(IUser iUser) {
		int diffDays = iUser.normalRouletteDatetime == null ? 1 : CouponDateUtils.diffDays(iUser.normalRouletteDatetime, CouponDateUtils.getCurrentDate());
		if (diffDays < 1) {
			return false;
		}
		return true;
	}

	@Override
	public CouponDto execRoulette(IUser iUser, Integer areaId, Integer areaDetailId, Integer businessId) {

		Timestamp nowDate = CouponDateUtils.getCurrentDate();

		// お店リスト取得
		List<ShopBean> shopList = shopService.getShopBaens(areaId, areaDetailId, businessId);
		Collections.shuffle(shopList);
		ShopBean shopBean = shopList.get(0);

		// ショップクーポンを抽出する
		MShopCoupon shopCoupon = this.getRandomCoupon(shopBean.shopId, false);

		// 登録
		couponService.insertIUserCoupon(iUser.userId, shopCoupon);

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

		CouponActivityLogger.rouletteLog(iUser.userId, shopCoupon.shopId, shopCoupon.couponId, shopCoupon.rarity);

		return couponDto;
	}

	@Override
	public CouponDto execRouletteByPoint(IUser iUser, Integer areaId, Integer areaDetailId, Integer businessId) {

		Timestamp nowDate = CouponDateUtils.getCurrentDate();

		// お店リスト取得
		List<ShopBean> shopList = shopService.getShopBaens(areaId, areaDetailId, businessId);
		Collections.shuffle(shopList);
		ShopBean shopBean = shopList.get(0);

		// ショップクーポンを抽出する
		MShopCoupon shopCoupon = this.getRandomCoupon(shopBean.shopId, false);

		// 登録
		couponService.insertIUserCoupon(iUser.userId, shopCoupon);

		String needPoint = mConfigService.getConfigValue(MConfigKey.ONE_TIME_POINT_NORMAL);
		iUser.point -= Integer.parseInt(needPoint);
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

		CouponActivityLogger.rouletteLog(iUser.userId, shopCoupon.shopId, shopCoupon.couponId, shopCoupon.rarity);

		return couponDto;
	}

	@Override
	public CouponDto execPremiumRoulette(Long userId, Integer shopId, Long userPoint) {

		// お店リスト取得
		ShopBean shopBean = shopService.getShopBean(shopId);
		if (shopBean == null) {
			throw new IllegalArgumentException("お店情報取得エラー。shopId=" + shopId);
		}

		// ショップクーポンを抽出する
		MShopCoupon shopCoupon = this.getRandomCoupon(shopBean.shopId, true);
		// クーポン付与
		couponService.insertIUserCoupon(userId, shopCoupon);

//		int oneTimeCoin = Integer.parseInt(mConfigService.getConfigValue(MConfigKey.ONE_TIME_COIN));
		int oneTimePoint = Integer.parseInt(mConfigService.getConfigValue(MConfigKey.ONE_TIME_POINT_PREMIUM));

		if (userPoint >= oneTimePoint) {
			userService.usePoint(userId, oneTimePoint);
		}
//		else {
//			// コイン消費
//			coinService.useCoin(userId, oneTimeCoin);
//		}

		CouponDto couponDto = new CouponDto();
		couponDto.shopBean = shopBean;
		couponDto.mShopCoupon = shopCoupon;

		// スロットの止まる位置情報取得
		couponDto.positionList = this.getStopPositionList(shopCoupon);

		int chance = MathUtils.getRandomRange(1, 100);
		if (chance > 50) {
			couponDto.chanceFlg = true;
		}

		CouponActivityLogger.rouletteLog(userId, shopCoupon.shopId, shopCoupon.couponId, shopCoupon.rarity);

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

}
