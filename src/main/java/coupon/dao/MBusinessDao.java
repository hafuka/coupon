package coupon.dao;

import coupon.entity.MBusiness;
import java.util.List;
import javax.annotation.Generated;

import static coupon.entity.MBusinessNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MBusiness}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/10 12:58:11")
public class MBusinessDao extends AbstractDao<MBusiness> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param businessId
     *            識別子
     * @return エンティティ
     */
    public MBusiness findById(Integer businessId) {
        return select().id(businessId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MBusiness> findAllOrderById() {
        return select().orderBy(asc(businessId())).getResultList();
    }
}