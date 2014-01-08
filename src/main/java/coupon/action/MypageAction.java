package coupon.action;

import org.seasar.struts.annotation.Execute;

public class MypageAction {
	
	@Execute(validator = false)
	public String index() {
        return "/mypage/mypage.ftl";
	}
	
}
