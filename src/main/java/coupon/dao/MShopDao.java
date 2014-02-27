package coupon.dao;

import static coupon.entity.MShopNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.ComplexWhere;

import coupon.entity.MShop;

/**
 * {@link MShop}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/10 15:41:47")
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
    
	public List<MShop> findLikeShopName(String[] searchValues) {
		ComplexWhere cw = new ComplexWhere();
		int index = 0;
		for (String value : searchValues) {
			if (index > 0) {
				cw.or();
			}
			cw.contains(shopName(), value);
			index++;
		}
		return jdbcManager
				.from(MShop.class)
				.where(cw).getResultList();
	}
}