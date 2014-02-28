package coupon.dao;

import static coupon.entity.IUserCouponNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;

import coupon.entity.IUserCoupon;
import coupon.util.CouponDateUtils;

/**
 * {@link IUserCoupon}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/08 13:48:25")
public class IUserCouponDao extends AbstractDao<IUserCoupon> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param userCouponId ユーザークーポンID
     * @return エンティティ
     */
    public IUserCoupon findById(String userCouponId) {
        return select().id(userCouponId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<IUserCoupon> findAllOrderById() {
        return select().orderBy(asc(userCouponId())).getResultList();
    }
    
    /**
     * ユーサーのクーポン情報を使用期限の昇順で取得する
     * @param userId
     * @return
     */
    public List<IUserCoupon> findByUserIdOrderByLimitDate(Long userId) {
    	return jdbcManager
				.from(IUserCoupon.class)
				.where(new SimpleWhere().eq(userId(), userId).gt(limitDatetime(), CouponDateUtils.getCurrentDate())).orderBy(asc(limitDatetime()))
				.getResultList();
    }
}