package coupon.dao;

import coupon.entity.MConfig;
import java.util.List;
import javax.annotation.Generated;

import static coupon.entity.MConfigNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MConfig}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/09 15:38:50")
public class MConfigDao extends AbstractDao<MConfig> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param name
     *            識別子
     * @return エンティティ
     */
    public MConfig findById(String name) {
        return select().id(name).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MConfig> findAllOrderById() {
        return select().orderBy(asc(name())).getResultList();
    }
}