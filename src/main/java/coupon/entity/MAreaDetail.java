package coupon.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * MAreaDetailエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/01/10 11:05:50")
public class MAreaDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /** areaIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = false)
    public Integer areaId;

    /** areaDetailIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = false)
    public Integer areaDetailId;

    /** detailNameプロパティ */
    @Column(length = 128, nullable = false, unique = false)
    public String detailName;
}