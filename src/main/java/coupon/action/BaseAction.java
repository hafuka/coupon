package coupon.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.arnx.jsonic.JSON;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;

import coupon.dto.LoginUserDto;
import coupon.enums.TransactionType;

public abstract class BaseAction {

	public static final String LOGIN_COOKIE_KEY = "_coupon_island_login_";

	public static final String FB_LOGIN_COOKIE_KEY = "_coupon_island_fb_login_";

	@Resource
	protected HttpServletRequest request;
	@Resource
	protected HttpServletResponse response;

	@Resource
	public LoginUserDto loginUserDto;

	public String token;

	protected String getAccountConfirmToken() {
		String token = RandomStringUtils.randomAlphanumeric(20);
        if (token == null) {
        	throw new IllegalArgumentException("Token発行エラー");
        }
        return token;
	}

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

    protected void setTransactionData(Long userId, Object data, TransactionType type) {
    	String key = type.key + "_" + userId;
    	request.getSession().removeAttribute(key);
    	request.getSession().setAttribute(key, data);
    }

    protected Object getTransactionData(Long userId, TransactionType type) {
    	String key = type.key + "_" + userId;
    	Object data = request.getSession().getAttribute(key);
    	request.getSession().removeAttribute(key);
    	return data;
    }

    protected void setCookie(String cookieKey, String cookieValue) {
    	Cookie c = new Cookie(cookieKey, cookieValue);
    	c.setMaxAge(60*60*24*7);  // cookieの生存期間 1週間
    	c.setPath(this.request.getContextPath());
    	this.response.addCookie(c);
    }

    protected String getCookie(String cookieKey) {
    	Cookie cookie[] = this.request.getCookies();
    	if(cookie != null){
    	    for(int i = 0; i < cookie.length; i++){
    	        if(cookie[i].getName().equals(cookieKey)){
    	            return cookie[i].getValue();
    	        }
    	    }
    	}
    	return null;
    }

    protected void updateCookieLimit(String cookieKey) {
    	String cookieValue = this.getCookie(cookieKey);
    	this.setCookie(cookieKey, cookieValue);
    }
}
