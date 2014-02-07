package coupon.dao;

import coupon.entity.MCoin;
import java.util.List;
import javax.annotation.Generated;

import static coupon.entity.MCoinNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MCoin}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/02/07 16:01:55")
public class MCoinDao extends AbstractDao<MCoin> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public MCoin findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MCoin> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}