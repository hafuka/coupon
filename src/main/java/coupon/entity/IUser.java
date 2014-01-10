package coupon.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * IUserエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/01/10 16:03:36")
public class IUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /** userIdプロパティ */
    @Id
    @Column(precision = 19, nullable = false, unique = true)
    public Long userId;

    /** emailプロパティ */
    @Column(length = 128, nullable = false, unique = false)
    public String email;

    /** nameプロパティ */
    @Column(length = 128, nullable = false, unique = false)
    public String name;

    /** pointプロパティ */
    @Column(precision = 19, nullable = true, unique = false)
    public Long point;

    /** loginDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp loginDatetime;

    /** loginBonusDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp loginBonusDatetime;

    /** consecutiveDaysプロパティ */
    @Column(precision = 19, nullable = true, unique = false)
    public Long consecutiveDays;

    /** normalRouletteDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp normalRouletteDatetime;

    /** updDatetimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp updDatetime;

    /** insDatetimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp insDatetime;
}