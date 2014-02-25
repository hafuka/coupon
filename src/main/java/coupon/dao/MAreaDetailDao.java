package coupon.dao;

import static coupon.entity.MAreaDetailNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;

import coupon.entity.MAreaDetail;

/**
 * {@link MAreaDetail}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/10 11:05:59")
public class MAreaDetailDao extends AbstractDao<MAreaDetail> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param areaId
     *            識別子
     * @param areaDetailId
     *            識別子
     * @return エンティティ
     */
    public MAreaDetail findById(Integer areaId, Integer areaDetailId) {
        return select().id(areaId, areaDetailId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MAreaDetail> findAllOrderById() {
        return select().orderBy(asc(areaId()), asc(areaDetailId())).getResultList();
    }
    
    
    public List<MAreaDetail> findByAreaId(Integer areaId) {
    	return jdbcManager
				.from(MAreaDetail.class)
				.where(new SimpleWhere().eq(areaId(), areaId)).orderBy(asc(areaDetailId()))
				.getResultList();
    }
}