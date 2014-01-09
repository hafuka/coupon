package coupon.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * MLoginBonusエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/01/09 16:45:50")
public class MLoginBonus implements Serializable {

    private static final long serialVersionUID = 1L;

    /** bonusIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer bonusId;

    /** bonusTypeプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer bonusType;

    /** pointプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer point;

    /** consecutiveDaysプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer consecutiveDays;
}