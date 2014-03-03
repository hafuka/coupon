package coupon.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class CouponActivityLogger {
	private CouponActivityLogger(){};
	
	public static void loginBonusLog(Long userId) {
		Logger logger = Logger.getLogger("loginBonus");
		Map<String, Object> logInfo = new HashMap<String, Object>();
		logInfo.put("userId", userId);
		logger.debug(logInfo);
	}
	
	public static void rouletteLog(Long userId, Integer shopId, Integer couponId, Integer rarity) {
		Logger logger = Logger.getLogger("roulette");
		Map<String, Object> logInfo = new HashMap<String, Object>();
		logInfo.put("userId", userId);
		logInfo.put("shopId", shopId);
		logInfo.put("couponId", couponId);
		logInfo.put("rarity", rarity);
		logger.debug(logInfo);
	}
	
	public static void paymentLog(Long userId, Integer amount) {
		Logger logger = Logger.getLogger("payment");
		Map<String, Object> logInfo = new HashMap<String, Object>();
		logInfo.put("userId", userId);
		logInfo.put("amount", amount);
		logger.debug(logInfo);
	}
}
