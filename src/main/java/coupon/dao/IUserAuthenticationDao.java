package coupon.dao;

import static coupon.entity.IUserAuthenticationNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;

import coupon.entity.IUserAuthentication;
import coupon.entity.IUserAuthenticationNames;
import coupon.util.CryptUtils;

/**
 * {@link IUserAuthentication}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/17 18:28:11")
public class IUserAuthenticationDao extends AbstractDao<IUserAuthentication> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userId
     *            識別子
     * @return エンティティ
     */
    public IUserAuthentication findById(Long userId) {
        return select().id(userId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<IUserAuthentication> findAllOrderById() {
        return select().orderBy(asc(userId())).getResultList();
    }

	public Long countByEmailAndPassword(String email, String password) throws Exception {
		String encPassword = CryptUtils.encrypt(password);
		return jdbcManager.from(IUserAuthentication.class).where(new SimpleWhere().eq(IUserAuthenticationNames.email(), email).eq(IUserAuthenticationNames.password(), encPassword)).getCount();
	}
}