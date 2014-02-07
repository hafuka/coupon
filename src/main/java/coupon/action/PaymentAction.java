package coupon.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.MCoin;
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
	public String coinId;
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
		coin = paymentService.getCoin(Integer.parseInt(coinId));
		if (coin == null) {
			throw new IllegalArgumentException("コイン情報取得エラー。selectCoinId="+coinId);
		}
		
		return "/payment/payment-confirm.ftl";
	}
	
	@Execute(validator=false)
	public String card() {
		return "/payment/payment-card.ftl";
	}
	
	@Execute(validator=false)
	public String cardConfirm() {
		
		MCoin mCoin = paymentService.getCoin(Integer.parseInt(coinId));
		if (mCoin == null) {
			throw new IllegalArgumentException("コイン情報取得エラー。selectCoinId="+coinId);
		}
		return "/payment/payment-card-confirm.ftl";
	}
	
	@Execute(validator=false)
	public String payment() {
		
		MCoin mCoin = paymentService.getCoin(Integer.parseInt(coinId));
		if (coin == null) {
			throw new IllegalArgumentException("コイン情報取得エラー。selectCoinId="+coinId);
		}
		
		int amount = mCoin.yen;
		
		// 課金処理
		webPayService.doPayment(cardName, cardNo, month, year, cvc, amount, saveCard);
		
		return "/payment/payment-result.ftl";
	}
}
