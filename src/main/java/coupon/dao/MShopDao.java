package coupon.dao;

import coupon.entity.MShop;
import java.util.List;
import javax.annotation.Generated;

import static coupon.entity.MShopNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MShop}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/10 12:58:12")
public class MShopDao extends AbstractDao<MShop> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param shopId
     *            識別子
     * @return エンティティ
     */
    public MShop findById(Integer shopId) {
        return select().id(shopId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MShop> findAllOrderById() {
        return select().orderBy(asc(shopId())).getResultList();
    }
}