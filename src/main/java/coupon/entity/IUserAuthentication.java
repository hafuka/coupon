package coupon.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * IUserAuthenticationエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/01/08 13:38:18")
public class IUserAuthentication implements Serializable {

    private static final long serialVersionUID = 1L;

    /** userIdプロパティ */
    @Id
    @Column(precision = 19, nullable = false, unique = true)
    public Long userId;

    /** passwordプロパティ */
    @Column(length = 128, nullable = false, unique = false)
    public String password;

    /** updDatetimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp updDatetime;

    /** insDatetimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp insDatetime;
}