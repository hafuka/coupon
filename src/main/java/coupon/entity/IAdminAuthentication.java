package coupon.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * IAdminAuthenticationエンティティクラス
 *
 */
@Entity
public class IAdminAuthentication implements Serializable {

    private static final long serialVersionUID = 1L;

    /** shopIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer shopId;
    
    /** emailプロパティ */
    @Column(length = 128, nullable = false, unique = false)
    public String email;

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