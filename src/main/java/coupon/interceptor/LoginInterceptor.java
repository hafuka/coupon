package coupon.interceptor;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;

import coupon.dto.LoginUserDto;


public class LoginInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;

	@Resource
	protected LoginUserDto loginUserDto;

	/**
	 * AbstractInterceptorを継承する際に、実装する必要のあるメソッド。
	 * 割り込ませる処理を記述。
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		if (loginUserDto == null || loginUserDto.userId == null) {
			return "/";
		}
		
		return invocation.proceed();
	}
}

