package coupon.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * IUserCoinエンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/01/10 16:03:36")
public class IUserCoin implements Serializable {

    private static final long serialVersionUID = 1L;

    /** userIdプロパティ */
    @Id
    @Column(precision = 19, nullable = false, unique = true)
    public Long userId;

    /** idプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    @Column(precision = 10, nullable = false, unique = false)
    public Integer coin;

    /** limitDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp limitDatetime;

    /** updDatetimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp updDatetime;

    /** insDatetimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp insDatetime;
}