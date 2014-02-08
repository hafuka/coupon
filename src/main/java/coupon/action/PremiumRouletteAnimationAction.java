package coupon.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.dto.CouponDto;
import coupon.entity.IUserCoin;
import coupon.enums.MConfigKey;
import coupon.enums.TransactionType;
import coupon.service.MConfigService;
import coupon.service.RouletteService;
import coupon.service.UserService;

public class PremiumRouletteAnimationAction extends BaseAction {

	@Resource
	protected RouletteService rouletteService;
	@Resource
	protected UserService userService;
	@Resource
	protected MConfigService mConfigService;

	/***** IN項目 *****/
	public Integer shopId;

	/***** OUT項目 *****/
	public CouponDto coupon;

	@Execute(validator=false)
	public String index() {
		if (!isValidToken(token)) {
			throw new IllegalArgumentException("Tokenエラー");
		}

		Integer sessionShopId = (Integer)getTransactionData(loginUserDto.userId, TransactionType.TO_ROULETTE);
		if (sessionShopId != null) {
			shopId = sessionShopId;
		}

		if (shopId == null) {
			throw new IllegalArgumentException("shopId必須エラー");
		}

		// ルーレット実行可能チェック
		if (!checkRoulette()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("shopId", shopId);
			super.setTransactionData(loginUserDto.userId, shopId, TransactionType.TO_PAYMENT);
			return "/payment?redirect=true";
		}


		// ルーレット実行処理
		coupon = rouletteService.execPremiumRoulette(loginUserDto.userId, shopId);
		setTransactionData(loginUserDto.userId, coupon, TransactionType.NORMAL_ROULETTE);
		super.getFormToken();
		return "/roulette/premium-animation.ftl";
	}


	private boolean checkRoulette() {
		String needCoin = mConfigService.getConfigValue(MConfigKey.ONE_TIME_COIN.key);
		IUserCoin iUserCoin = userService.getIUserCoin(loginUserDto.userId);
		if (iUserCoin == null || iUserCoin.coin == null || iUserCoin.coin < Integer.parseInt(needCoin)) {
			return false;
		}
		return true;
	}

}
