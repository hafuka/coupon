package coupon.dao;

import static coupon.entity.IAdminAuthenticationNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;

import coupon.entity.IAdminAuthentication;
import coupon.util.CryptUtils;

/**
 * {@link IAdminAuthentication}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/02/27 19:35:36")
public class IAdminAuthenticationDao extends AbstractDao<IAdminAuthentication> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param shopId
     *            識別子
     * @return エンティティ
     */
    public IAdminAuthentication findById(Integer shopId) {
        return select().id(shopId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<IAdminAuthentication> findAllOrderById() {
        return select().orderBy(asc(shopId())).getResultList();
    }
    
    
    public IAdminAuthentication findByEmailAndPassword(String email, String password) throws Exception {
    	String pwd = CryptUtils.encrypt(password);
    	return jdbcManager.from(IAdminAuthentication.class).where(new SimpleWhere().eq(email(), email).eq(password(), pwd)).getSingleResult();
    }
}