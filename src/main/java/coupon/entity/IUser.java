package coupon.entity;

import java.io.Serializable;
import java.sql.Date;
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
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/01/08 13:38:18")
public class IUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /** userIdプロパティ */
    @Id
    @Column(precision = 19, nullable = false, unique = true)
    public Long userId;

    /** mailプロパティ */
    @Column(length = 128, nullable = false, unique = false)
    public String mail;

    /** nameプロパティ */
    @Column(length = 128, nullable = false, unique = false)
    public String name;

    /** updDatetimeプロパティ */
    @Column(nullable = false, unique = false)
    public Date updDatetime;

    /** insDatetimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp insDatetime;
}