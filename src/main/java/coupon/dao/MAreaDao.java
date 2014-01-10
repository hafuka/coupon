package coupon.dao;

import coupon.entity.MArea;
import java.util.List;
import javax.annotation.Generated;

import static coupon.entity.MAreaNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MArea}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/10 11:05:59")
public class MAreaDao extends AbstractDao<MArea> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param areaId
     *            識別子
     * @return エンティティ
     */
    public MArea findById(Integer areaId) {
        return select().id(areaId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MArea> findAllOrderById() {
        return select().orderBy(asc(areaId())).getResultList();
    }
}