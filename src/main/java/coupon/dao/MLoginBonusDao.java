package coupon.dao;

import coupon.entity.MLoginBonus;
import java.util.List;
import javax.annotation.Generated;

import static coupon.entity.MLoginBonusNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MLoginBonus}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/10 11:44:05")
public class MLoginBonusDao extends AbstractDao<MLoginBonus> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param bonusType
     *            識別子
     * @return エンティティ
     */
    public MLoginBonus findById(Integer bonusType) {
        return select().id(bonusType).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MLoginBonus> findAllOrderById() {
        return select().orderBy(asc(bonusType())).getResultList();
    }
}