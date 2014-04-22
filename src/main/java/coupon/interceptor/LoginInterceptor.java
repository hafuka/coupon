package coupon.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang.StringUtils;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.util.RequestUtil;
import org.seasar.struts.util.ResponseUtil;

import coupon.dto.LoginUserDto;
import coupon.entity.IUserLogin;
import coupon.service.CookieService;
import coupon.service.LoginService;


public class LoginInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;

	@Resource
	protected LoginUserDto loginUserDto;
	@Resource
	protected LoginService loginService;
	@Resource
	protected CookieService cookieService;

	/**
	 * AbstractInterceptorを継承する際に、実装する必要のあるメソッド。
	 * 割り込ませる処理を記述。
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

//		Map<String, Object> sessionScope = SingletonS2Container.getComponent("sessionScope");
//		LoginUserDto loginDto = (LoginUserDto) sessionScope.get("loginUserDto");
//		// loginDtoがNULLだったり、NULLでなくてもコードがNULLの場合タイムアウトと見なす。
//		if (loginDto == null || loginDto.userId == null) {
//			// タイムアウト画面
//			return "/";
//		}

		String loginCookieValue = cookieService.getCookieValue("_coupon_island_login_");
		String fbLoginCookieValue = cookieService.getCookieValue("_coupon_island_fb_login_");
    	IUserLogin userLogin = null;
		if (StringUtils.isEmpty(loginCookieValue) && StringUtils.isEmpty(fbLoginCookieValue)) {
    		return "/";
    	} else if (StringUtils.isNotEmpty(loginCookieValue)) {
    		userLogin = loginService.getIUserLogin(loginCookieValue);
        	if (userLogin == null) {
        		Cookie c = new Cookie("_coupon_island_login_", null);
        		c.setMaxAge(0);  // 即死にする
        		c.setPath(RequestUtil.getRequest().getContextPath());
        		ResponseUtil.getResponse().addCookie(c);
        	}
    	} else if (StringUtils.isNotEmpty(fbLoginCookieValue)) {
    		userLogin = loginService.getIUserLogin(fbLoginCookieValue);
        	if (userLogin == null) {
        		Cookie c = new Cookie("_coupon_island_fb_login_", null);
        		c.setMaxAge(0);  // 即死にする
        		c.setPath(RequestUtil.getRequest().getContextPath());
        		ResponseUtil.getResponse().addCookie(c);
        	}
    	}

		if (userLogin == null) {
			return "/";
		}

    	loginUserDto.userId = userLogin.userId;

		return invocation.proceed();
	}
}

