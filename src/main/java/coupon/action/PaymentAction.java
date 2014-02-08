package coupon.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.MCoin;
import coupon.enums.TransactionType;
import coupon.service.PaymentService;
import coupon.service.WebPayService;

/**
 * 課金トップアクション
 *
 */
public class PaymentAction extends BaseAction {

	@Resource
	protected PaymentService paymentService;
	@Resource
	protected WebPayService webPayService;

	// 初期表示用
	public Integer userCoin;
	public List<MCoin> coinList;

	// 確認用
	public Integer coinId;
	public MCoin coin;

	// カード入力用
	public String cardName;
	public String cardNo;
	public Integer month;
	public Integer year;
	public Integer cvc;
	public boolean saveCard;

	@Execute(validator=false)
	public String index() {
		coinList = paymentService.getCoinList();
		userCoin = paymentService.getIUserCoin(loginUserDto.userId);
		return "/payment/payment-top.ftl";
	}

	@Execute(validator=false)
	public String confirm() {
		coin = paymentService.getCoin(coinId);
		if (coin == null) {
			throw new IllegalArgumentException("コイン情報取得エラー。selectCoinId="+coinId);
		}

		return "/payment/payment-confirm.ftl";
	}

	@Execute(validator=false, reset="saveCardReset")
	public String card() {
		return "/payment/payment-card.ftl";
	}

	@Execute(validator=false, reset="saveCardReset")
	public String cardConfirm() {
		return "/payment/payment-card-confirm.ftl";
	}

	@Execute(validator=false)
	public String payment() {

		MCoin mCoin = paymentService.getCoin(coinId);
		if (mCoin == null) {
			throw new IllegalArgumentException("コイン情報取得エラー。selectCoinId="+coinId);
		}

		int amount = mCoin.yen;

		// 課金処理
		paymentService.execPayment(loginUserDto.userId, coinId, cardName, cardNo, month, year, cvc, amount, saveCard);

		Integer shopId = (Integer)super.getTransactionData(loginUserDto.userId, TransactionType.TO_PAYMENT);
		if (shopId != null) {
			super.setTransactionData(loginUserDto.userId, shopId, TransactionType.TO_ROULETTE);
			String token = super.getFormToken();
			return "/premiumRouletteAnimation?redirect=true&token=" + token;
		}

		return "/payment/payment-result.ftl";
	}

	public void saveCardReset() {
		this.saveCard = false;
	}
}
