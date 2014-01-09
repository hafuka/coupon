package coupon.action;

import org.seasar.struts.annotation.Execute;

public class MypageAction extends BaseAction {
	
	@Execute(validator = false)
	public String index() {
        return "/mypage/mypage.ftl";
	}
	
}
