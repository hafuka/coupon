package coupon.action;

import java.util.List;

import javax.annotation.Resource;

import jp.webpay.exception.CardException;
import jp.webpay.exception.InvalidRequestException;
import jp.webpay.model.Card;

import org.seasar.struts.annotation.Execute;

import coupon.entity.IUser;
import coupon.entity.MCoin;
import coupon.enums.CardErrorMessage;
import coupon.enums.TransactionType;
import coupon.service.PaymentService;
import coupon.service.UserService;
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
	@Resource
	protected UserService userService;
	
	public Integer userCoin;
	public List<MCoin> coinList;
	public Integer coinId;
	public MCoin coin;
	public String cardName;
	public String cardNo;
	public Integer month;
	public Integer year;
	public Integer cvc;
	public boolean saveCard;
	
	// 保持カード情報
	public Card cardInfo;
	
	public String errorMsg;
	public String errorTagId;
	public CardErrorMessage cardError;
	
	/**
	 * コイン選択画面
	 * @return
	 */
	@Execute(validator=false)
	public String index() {
		// コイン一覧取得
		coinList = paymentService.getCoinList();
		// ユーザーのコイン情報取得
		userCoin = paymentService.getIUserCoin(loginUserDto.userId);
		return "/payment/payment-top.ftl";
	}
	
	/**
	 * コイン購入確認画面
	 * @return
	 */
	@Execute(validator=false)
	public String confirm() {
		// コイン情報取得
		coin = paymentService.getCoin(coinId);
		if (coin == null) {
			throw new IllegalArgumentException("コイン情報取得エラー。selectCoinId="+coinId);
		}
		return "/payment/payment-confirm.ftl";
	}
	
	/**
	 * カード情報入力画面
	 * @return
	 */
	@Execute(validator=false, reset="saveCardReset")
	public String card() {
		IUser iUser = userService.getIUser(loginUserDto.userId);
		try{
			if (iUser.saveCardFlg == 1) {
				cardInfo = webPayService.getCardInfo(iUser);
				saveCard = true;
			}
		} catch (InvalidRequestException e) {
			iUser.customerId = null;
			iUser.saveCardFlg = 0;
			userService.updateIUser(iUser);
		}
		
		return "/payment/payment-card.ftl";
	}
	
	/**
	 * カード情報確認画面
	 * @return
	 */
	@Execute(validator=false, reset="saveCardReset")
	public String cardConfirm() {
		super.getFormToken();
		return "/payment/payment-card-confirm.ftl";
	}
	
	/**
	 * 購入処理
	 * @return
	 */
	@Execute(validator=false)
	public String payment() {
		
		if (!isValidToken(token)) {
			throw new IllegalArgumentException("Tokenエラー");
		}

		// 課金処理
		try {
			paymentService.execPayment(loginUserDto.userId, coinId, cardName, cardNo, month, year, cvc, saveCard);
		} catch (CardException e) {
			cardError = CardErrorMessage.getEnum(e.getCode());
			errorMsg = cardError.msg;
			errorTagId = cardError.tagId;
			return "/payment/payment-card.ftl";
		}
		
		Integer shopId = (Integer)super.getTransactionData(loginUserDto.userId, TransactionType.TO_PAYMENT);
		if (shopId != null) {
			super.setTransactionData(loginUserDto.userId, shopId, TransactionType.TO_ROULETTE);
			String token = super.getFormToken();
			return "/premiumRouletteAnimation?redirect=true&token=" + token;
		}
		
		throw new IllegalArgumentException("shopId is null.");
	}

	public void saveCardReset() {
		this.saveCard = false;
	}
}
