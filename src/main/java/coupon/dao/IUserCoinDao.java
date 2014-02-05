package coupon.dao;

import coupon.entity.IUserCoin;
import java.util.List;
import javax.annotation.Generated;

import static coupon.entity.IUserCoinNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link IUserCoin}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/02/04 19:49:02")
public class IUserCoinDao extends AbstractDao<IUserCoin> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userId
     *            識別子
     * @return エンティティ
     */
    public IUserCoin findById(Long userId) {
        return select().id(userId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<IUserCoin> findAllOrderById() {
        return select().orderBy(asc(userId())).getResultList();
    }
}