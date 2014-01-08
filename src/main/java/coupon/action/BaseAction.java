package coupon.action;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.RequestUtil;


public abstract class BaseAction {
	
	
	
	public ActionMessages msgRequest;
	
	/**
	 * バリデーション結果を設定します。
	 * @return /common/validate.jsp
	 * @throws IOException
	 */
	@Execute(validator = false)
	public String error() throws IOException{
		
		//*******************************************************//
		//アノテーションまたはロジックにてチェックされた
		//バリデーションの結果を取得する。
		//*******************************************************//
		HttpServletRequest request = RequestUtil.getRequest();
		msgRequest = (ActionMessages)request.getAttribute(Globals.ERROR_KEY);
		
		//*******************************************************//
		//同一IDのメッセージを纏める。
		//*******************************************************//
		for (Iterator<?> iter = msgRequest.get(); iter.hasNext(); ) {
			ActionMessage msg = (ActionMessage)iter.next();
		}
		
		return "/login/login.ftl";
	}
	
}
