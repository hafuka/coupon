package coupon.dao;

import coupon.entity.IUser;
import java.util.List;
import javax.annotation.Generated;

import static coupon.entity.IUserNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link IUser}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/10 16:03:44")
public class IUserDao extends AbstractDao<IUser> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userId
     *            識別子
     * @return エンティティ
     */
    public IUser findById(Long userId) {
        return select().id(userId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<IUser> findAllOrderById() {
        return select().orderBy(asc(userId())).getResultList();
    }
}