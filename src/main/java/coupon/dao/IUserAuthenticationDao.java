package coupon.dao;

import coupon.entity.IUserAuthentication;
import java.util.List;
import javax.annotation.Generated;

import static coupon.entity.IUserAuthenticationNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link IUserAuthentication}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/08 13:48:25")
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
}