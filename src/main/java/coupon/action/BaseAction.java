package coupon.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.arnx.jsonic.JSON;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;

import coupon.dto.LoginUserDto;
import coupon.enums.TransactionType;

public abstract class BaseAction {
	
	@Resource
	protected HttpServletRequest request;
	@Resource
	protected HttpServletResponse response;
	
	@Resource
	public LoginUserDto loginUserDto;
	
	public String token;
	
	/**
	 * トークン発行
	 * @return
	 */
    protected String getFormToken() {
    	
    	String token = RandomStringUtils.randomAlphanumeric(6);
        if (token == null) {
        	throw new IllegalArgumentException("Token発行エラー");
        }
        this.token = token;
        request.getSession().setAttribute("_T", token);
        
        return token;
    }
    
    /**
     * トークンチェック
     *
     * @param tokenValue Token文字列
     * @return true:トークン登録済み　false:トークン未登録
     */
    protected boolean isValidToken(String token) {
    	
    	String reqToken = (String)request.getSession().getAttribute("_T");
    	if (StringUtils.isEmpty(reqToken) || StringUtils.isEmpty(token)) {
    		return false;
    	}
    	
    	if (StringUtils.equals(reqToken, token)) {
    		request.getSession().removeAttribute("_T");
    		return true;
    	}

        return false;
    }
    
    
    protected void setJsonData(Object object) throws IOException {
    	response.setContentType("application/json");
        PrintWriter sendPoint = new PrintWriter(response.getOutputStream());
        
        //JSON形式に変換して出力します。
        sendPoint.println(JSON.encode(object));
        sendPoint.flush();
        sendPoint.close();
    }
    
    protected void setTransactionData(Object data, TransactionType type) {
    	request.getSession().removeAttribute(type.getKey());
    	request.getSession().setAttribute(type.getKey(), data);
    }
    
    protected Object getTransactionData(TransactionType type) {
    	Object data = request.getSession().getAttribute(type.getKey());
    	request.getSession().removeAttribute(type.getKey());
    	return data;
    }
}
