package coupon.dao;

import static coupon.entity.MShopCouponNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;

import coupon.entity.MShopCoupon;

/**
 * {@link MShopCoupon}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/08 13:48:25")
public class MShopCouponDao extends AbstractDao<MShopCoupon> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param shopId
     *            識別子
     * @param couponId
     *            識別子
     * @return エンティティ
     */
    public MShopCoupon findById(Integer shopId, Integer couponId) {
        return select().id(shopId, couponId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<MShopCoupon> findAllOrderById() {
        return select().orderBy(asc(shopId()), asc(couponId())).getResultList();
    }
    
    
    public List<MShopCoupon> findByShopIdOrderByRarity(Integer shopId) {
    	return jdbcManager
				.from(MShopCoupon.class)
				.where(new SimpleWhere().eq(shopId(), shopId)).orderBy(desc(rarity()))
				.getResultList();
    	
    }
}