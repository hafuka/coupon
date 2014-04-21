package coupon.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import coupon.entity.IUserCoin;
import coupon.service.CoinService;

public class TicketAction extends BaseAction {

	@Resource
	protected CoinService coinService;

	public List<IUserCoin> ticketList;

	@Execute(validator = false)
	public String index() {
		ticketList = coinService.getIUserCoins(loginUserDto.userId);
		return "ticket.ftl";
	}

}
