package coupon.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * MConfigエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/01/09 15:38:42")
public class MCoin implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** coinプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer coin;
    
    /** yenプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer yen;

    /** startDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp startDatetime;

    /** endDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp endDatetime;
}