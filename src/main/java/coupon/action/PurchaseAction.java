package coupon.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.service.WebPayService;

public class PurchaseAction extends BaseAction {
	
	public String webpayToken;
	public Integer price;
	
	@Resource
	protected WebPayService webPayService;
	
	@Execute(validator=false)
	public String purchase() {
		webPayService.chargeToken(webpayToken, price);
		return "/shop/shop-result.ftl";
	}
	
}
