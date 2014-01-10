package coupon.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * MBusinessエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/01/10 12:58:03")
public class MBusiness implements Serializable {

    private static final long serialVersionUID = 1L;

    /** businessIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer businessId;

    /** nameプロパティ */
    @Column(length = 128, nullable = false, unique = false)
    public String name;
}