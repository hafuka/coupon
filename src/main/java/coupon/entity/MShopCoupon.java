package coupon.entity;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * MShopCouponエンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/01/08 13:38:18")
public class MShopCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

    /** shopIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = false)
    public Integer shopId;

    /** couponIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = false)
    public Integer couponId;

    /** couponNameプロパティ */
    @Column(length = 128, nullable = false, unique = false)
    public String couponName;

    /** descriptionプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String description;

    /** probabilityプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer probability;

    /** limitDaysプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer limitDays;

    /** rarityプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer rarity;
}