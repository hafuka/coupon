package coupon.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.seasar.framework.beans.util.BeanMap;

import coupon.dao.IUserAuthenticationDao;
import coupon.dao.IUserDao;
import coupon.entity.IUser;
import coupon.entity.IUserAuthentication;
import coupon.entity.IUserAuthenticationNames;
import coupon.service.UserService;
import coupon.util.CryptUtils;
import coupon.util.DateUtils;

public class UserServiceImpl implements UserService {
	
	@Resource
	protected IUserDao iUserDao;
	@Resource
	protected IUserAuthenticationDao iUserAuthenticationDao;
	
	@Override
	public boolean checkLogin(String email, String password) throws Exception {
		Long count = iUserAuthenticationDao.countByEmailAndPassword(email, password);
		if (count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void registUser(String email, String password, String name) throws Exception {
		
		Timestamp nowDate = DateUtils.getCurrentDate();
		
		// IUserの登録
		Long userId = iUserDao.getCount() + 1;
		IUser iUser = new IUser();
		iUser.userId = userId;
		iUser.email = email;
		iUser.name = name;
		iUser.insDatetime = nowDate;
		iUser.updDatetime = nowDate;
		iUserDao.insert(iUser);
		
		IUserAuthentication iUserAuthentication = new IUserAuthentication();
		iUserAuthentication.userId = userId;
		iUserAuthentication.email = email;
		iUserAuthentication.password = CryptUtils.encrypt(password);
		iUserAuthentication.insDatetime = nowDate;
		iUserAuthentication.updDatetime = nowDate;
		iUserAuthenticationDao.insert(iUserAuthentication);
	}

	@Override
	public IUser getIUser(Long userId) {
		return iUserDao.findById(userId);
	}

	@Override
	public IUserAuthentication getIUserAuth(String email, String password) throws Exception {
		String encPassword = CryptUtils.encrypt(password);
		
		BeanMap map = new BeanMap();
		map.put(IUserAuthenticationNames.email().toString(), email);
		map.put(IUserAuthenticationNames.password().toString(), encPassword);
		
		List<IUserAuthentication> iUserAuthList = iUserAuthenticationDao.findByCondition(map);
		
		if (CollectionUtils.isEmpty(iUserAuthList)) {
			return null;
		}
		return iUserAuthList.get(0);
	}

}
