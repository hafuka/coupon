package coupon.dao;

import static coupon.entity.IUserFavoriteNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;

import coupon.entity.IUserFavorite;

/**
 * {@link IUserFavorite}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/02/25 11:38:46")
public class IUserFavoriteDao extends AbstractDao<IUserFavorite> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param userId
     *            識別子
     * @param shopId
     *            識別子
     * @return エンティティ
     */
    public IUserFavorite findById(Long userId, Integer shopId) {
        return select().id(userId, shopId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<IUserFavorite> findAllOrderById() {
        return select().orderBy(asc(userId()), asc(shopId())).getResultList();
    }
    
    /**
     * お気にショップ取得(登録日時の昇順)
     * @param userId
     * @return
     */
    public List<IUserFavorite> findByUserIdOrderByInsDatetime(Long userId) {
    	return jdbcManager
				.from(IUserFavorite.class)
				.where(new SimpleWhere().eq(userId(), userId)).orderBy(asc(insDatetime()))
				.getResultList();
    }
}