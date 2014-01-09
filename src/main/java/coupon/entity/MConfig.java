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
public class MConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /** nameプロパティ */
    @Id
    @Column(length = 128, nullable = false, unique = true)
    public String name;

    /** valueプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String value;

    /** startDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp startDatetime;

    /** endDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp endDatetime;
}