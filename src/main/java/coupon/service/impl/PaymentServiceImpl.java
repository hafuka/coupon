package coupon.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import coupon.dao.IUserCoinDao;
import coupon.dao.MCoinDao;
import coupon.entity.IUserCoin;
import coupon.entity.MCoin;
import coupon.service.PaymentService;
import coupon.service.WebPayService;
import coupon.util.CouponDateUtils;

public class PaymentServiceImpl implements PaymentService {

	@Resource
	protected IUserCoinDao iUserCoinDao;
	@Resource
	protected MCoinDao mCoinDao;
	@Resource
	protected WebPayService webPayService;

	@Override
	public int getIUserCoin(Long userId) {
		IUserCoin userCoin = iUserCoinDao.findById(userId);
		if (userCoin != null) {
			return userCoin.coin;
		}
		return 0;
	}

	@Override
	public List<MCoin> getCoinList() {
		return mCoinDao.findAllOrderById();
	}

	@Override
	public MCoin getCoin(Integer id) {
		return mCoinDao.findById(id);
	}

	@Override
	public void execPayment(Long userId, Integer coinId, String cardName, String cardNo, Integer month, Integer year, Integer cvc, Integer amount, boolean saveCard) {

		MCoin mCoin = getCoin(coinId);

		// カード決済処理
		webPayService.doPayment(userId, cardName, cardNo, month, year, cvc, amount, saveCard);

		// ユーザーのコインを増やす
		Timestamp nowDate = CouponDateUtils.getCurrentDate();
		IUserCoin userCoin = iUserCoinDao.findById(userId);
		if (userCoin == null) {
			userCoin = new IUserCoin();
			userCoin.userId = userId;
			userCoin.coin = mCoin.coin;
			userCoin.insDatetime = nowDate;
			userCoin.updDatetime = nowDate;
			iUserCoinDao.insert(userCoin);
		} else {
			userCoin.coin = userCoin.coin + mCoin.coin;
			userCoin.updDatetime = nowDate;
			iUserCoinDao.update(userCoin);
		}
	}

}
