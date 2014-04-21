package coupon.dao;

import static coupon.entity.IUserCoinNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;

import coupon.entity.IUserCoin;
import coupon.util.CouponDateUtils;

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
    public IUserCoin findById(Long userId, Integer id) {
        return select().id(userId, id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<IUserCoin> findAllOrderById() {
        return select().orderBy(asc(userId())).getResultList();
    }

    public List<IUserCoin> findByUserIdOrderByLimitDatetimeAsc(Long userId) {
    	return jdbcManager
				.from(IUserCoin.class)
				.where(new SimpleWhere().eq(userId(), userId).gt(coin(), 0).gt(limitDatetime(), CouponDateUtils.getCurrentDate())).orderBy(asc(limitDatetime()))
				.getResultList();
    }

    public Integer findUserMaxId(Long userId) {
    	Integer maxId = jdbcManager.selectBySql(Integer.class, "SELECT MAX(ID) FROM I_USER_COIN WHERE USER_ID = ?", userId).getSingleResult();
    	if (maxId == null) {
    		return 0;
    	}
    	return maxId;
	}
}