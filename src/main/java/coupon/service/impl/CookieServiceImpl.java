package coupon.service.impl;

import javax.servlet.http.Cookie;

import org.seasar.struts.util.RequestUtil;

import coupon.service.CookieService;

public class CookieServiceImpl implements CookieService {

	@Override
	public String getCookieValue(String key) {
		String cookieValue = null;
		Cookie cookie[] = RequestUtil.getRequest().getCookies();
    	if(cookie != null){
    	    for(int i = 0; i < cookie.length; i++){
    	        if(cookie[i].getName().equals(key)){
    	        	cookieValue = cookie[i].getValue();
    	        }
    	    }
    	}
		return cookieValue;
	}

}
