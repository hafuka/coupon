package coupon.dao;

import coupon.entity.IUserCoupon;
import java.util.List;
import javax.annotation.Generated;

import static coupon.entity.IUserCouponNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link IUserCoupon}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/08 13:48:25")
public class IUserCouponDao extends AbstractDao<IUserCoupon> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userId
     *            識別子
     * @param shopId
     *            識別子
     * @param couponType
     *            識別子
     * @param couponId
     *            識別子
     * @return エンティティ
     */
    public IUserCoupon findById(Long userId, Integer shopId, Integer couponType, Integer couponId) {
        return select().id(userId, shopId, couponType, couponId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<IUserCoupon> findAllOrderById() {
        return select().orderBy(asc(userId()), asc(shopId()), asc(couponType()), asc(couponId())).getResultList();
    }
}