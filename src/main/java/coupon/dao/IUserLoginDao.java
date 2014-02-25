package coupon.dao;

import coupon.entity.IUserLogin;
import java.util.List;
import javax.annotation.Generated;

import static coupon.entity.IUserLoginNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link IUserLogin}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/02/25 15:33:13")
public class IUserLoginDao extends AbstractDao<IUserLogin> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param cookieValue
     *            識別子
     * @return エンティティ
     */
    public IUserLogin findById(String cookieValue) {
        return select().id(cookieValue).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<IUserLogin> findAllOrderById() {
        return select().orderBy(asc(cookieValue())).getResultList();
    }
}