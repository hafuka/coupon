package coupon.action;

import java.io.IOException;
import java.util.Properties;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.seasar.struts.annotation.Execute;

import coupon.entity.IUser;
import coupon.entity.IUserAuthentication;
import coupon.service.LoginService;
import coupon.service.UserService;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.User;


public class FacebookLoginAction extends BaseAction {

	@Resource
	protected UserService userService;
	@Resource
	protected LoginService loginService;

	private static final String PERMISSION = "email,publish_stream";

	@Execute(validator = false)
	public String index() throws IOException {

		// ログイン済みの場合はmypageへリダイレクト
		if (StringUtils.isNotEmpty(super.getCookie(FB_LOGIN_COOKIE_KEY))) {
			return "/mypage?redirect=true";
		}

		Properties prop = new Properties();
        prop.load(this.getClass().getClassLoader().getResourceAsStream("facebook.properties"));
        final String appId = prop.getProperty("appId");
        final String appSecret = prop.getProperty("appSecret");

        Facebook facebook = new FacebookFactory().getInstance();
        facebook.setOAuthAppId(appId, appSecret);
        facebook.setOAuthPermissions(PERMISSION);

        request.getSession().setAttribute("facebook", facebook);
        StringBuffer callbackURL = request.getRequestURL();
        int index = callbackURL.lastIndexOf("/");
        callbackURL.replace(index, callbackURL.length(), "").append("/facebookLogin/callback");
        response.sendRedirect(facebook.getOAuthAuthorizationURL(callbackURL.toString()));

        return null;
	}


	@Execute(validator = false)
	public String callback() throws Exception {
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		// アクセストークンの取得
		Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
        String oauthCode = request.getParameter("code");
        try {
        	facebook.getOAuthAccessToken(oauthCode);
        } catch (FacebookException e) {
            throw new Exception(e);
        }

        User user = facebook.getMe();

        String accountConfirmToken = super.getAccountConfirmToken();

        IUserAuthentication iUserAuthentication = userService.getIUserAuth(user.getEmail(), user.getId());
		if (iUserAuthentication != null) {
			String cookieValue = loginService.insertIUserLogin(iUserAuthentication.userId);
			super.setCookie(FB_LOGIN_COOKIE_KEY, cookieValue);
			return "/mypage?redirect=true";
		}

        // ユーザー情報登録
 		IUser iUser = userService.registUser(user.getEmail(), user.getId(), user.getName(), accountConfirmToken);

 		loginUserDto.userId = iUser.userId;
 		String cookieValue = loginService.insertIUserLogin(iUser.userId);
		super.setCookie(FB_LOGIN_COOKIE_KEY, cookieValue);

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        return "/mypage?redirect=true";

	}

}
