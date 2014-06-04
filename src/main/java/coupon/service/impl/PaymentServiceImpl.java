package coupon.service.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;

import coupon.dao.IUserCoinDao;
import coupon.dao.MCoinDao;
import coupon.entity.IUserCoin;
import coupon.entity.MCoin;
import coupon.enums.MConfigKey;
import coupon.service.MConfigService;
import coupon.service.PaymentService;
import coupon.service.WebPayService;
import coupon.util.CouponActivityLogger;
import coupon.util.CouponDateUtils;

public class PaymentServiceImpl implements PaymentService {

	@Resource
	protected IUserCoinDao iUserCoinDao;
	@Resource
	protected MCoinDao mCoinDao;
	@Resource
	protected WebPayService webPayService;
	@Resource
	protected MConfigService mConfigService;

	@Override
	public List<MCoin> getCoinList() {
		return mCoinDao.findAllOrderById();
	}

	@Override
	public MCoin getCoin(Integer id) {
		return mCoinDao.findById(id);
	}

	@Override
	public void execPayment(Long userId, Integer coinId, String cardName, String cardNo, Integer month, Integer year, Integer cvc, boolean saveCard) {

		MCoin mCoin = getCoin(coinId);
		if (mCoin == null) {
			throw new IllegalArgumentException("コイン情報取得エラー。selectCoinId="+coinId);
		}

		if (StringUtils.startsWith(cardNo, "*") && saveCard) {
			// カード決済処理
			webPayService.doPaymentByCustomerId(userId, mCoin.yen);
		} else {
			// カード決済処理
			webPayService.doPayment(userId, cardName, cardNo, month, year, cvc, mCoin.yen, saveCard);
		}

		// スロット券有効期限
		String itemLimitMonth = mConfigService.getConfigValue(MConfigKey.ITEM_LIMIT_MONTH);

		// ユーザーのコインを増やす
		Timestamp nowDate = CouponDateUtils.getCurrentDate();
		int id = iUserCoinDao.findUserMaxId(userId);
		id += 1;
		IUserCoin userCoin = new IUserCoin();
		userCoin.userId = userId;
		userCoin.id = id;
		userCoin.coin = mCoin.coin;
		userCoin.limitDatetime = CouponDateUtils.add(nowDate, Integer.parseInt(itemLimitMonth), Calendar.MONTH);
		userCoin.insDatetime = nowDate;
		userCoin.updDatetime = nowDate;
		iUserCoinDao.insert(userCoin);

		CouponActivityLogger.paymentLog(userId, mCoin.yen);
	}

	@Override
	public void execPayment(Long userId, String paypalItemId) {

		MCoin targetCoin = null;

		List<MCoin> coinList = this.getCoinList();
		for (MCoin mCoin : coinList) {
			if (StringUtils.equals(mCoin.paypalItemId, paypalItemId)) {
				targetCoin = mCoin;
				break;
			}
		}

		// スロット券有効期限
		String itemLimitMonth = mConfigService.getConfigValue(MConfigKey.ITEM_LIMIT_MONTH);

		// ユーザーのスロット券を増やす
		Timestamp nowDate = CouponDateUtils.getCurrentDate();
		int id = iUserCoinDao.findUserMaxId(userId);
		id += 1;
		IUserCoin userCoin = new IUserCoin();
		userCoin.userId = userId;
		userCoin.id = id;
		userCoin.coin = targetCoin.coin;
		userCoin.limitDatetime = CouponDateUtils.add(nowDate, Integer.parseInt(itemLimitMonth), Calendar.MONTH);
		userCoin.insDatetime = nowDate;
		userCoin.updDatetime = nowDate;
		iUserCoinDao.insert(userCoin);

		CouponActivityLogger.paymentLog(userId, targetCoin.yen);
	}

}
