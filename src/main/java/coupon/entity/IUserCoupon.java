package coupon.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * IUserCouponエンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/01/08 13:38:18")
public class IUserCoupon implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /** userCouponIdプロパティ */
    @Id
    @Column(precision = 255, nullable = false, unique = false)
    public String userCouponId;
    
    /** userIdプロパティ */
    @Column(precision = 19, nullable = false, unique = false)
    public Long userId;

    /** shopIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer shopId;

    /** couponIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer couponId;

    /** limitDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp limitDatetime;
    
    /** nameプロパティ */
    @Column(precision = 128, nullable = false, unique = false)
    public String name;
    
    /** descriptionプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String description;

    /** updDatetimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp updDatetime;

    /** insDatetimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp insDatetime;
}