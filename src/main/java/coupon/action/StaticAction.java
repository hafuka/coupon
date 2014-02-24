package coupon.action;

import org.seasar.framework.util.StringUtil;
import org.seasar.struts.annotation.Execute;

public class StaticAction extends BaseAction {
	
	public String page;
	
	@Execute(validator = false)
	public String index() {
		if (StringUtil.isEmpty(page)) {
			throw new IllegalArgumentException("page is null.");
		}
        return page + ".ftl";
	}
}
