package coupon.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * MShopエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/01/10 15:41:38")
public class MShop implements Serializable {

    private static final long serialVersionUID = 1L;

    /** shopIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer shopId;

    /** businessIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer businessId;

    /** shopNameプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String shopName;

    /** descriptionプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String description;

    /** urlプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String url;

    /** tellプロパティ */
    @Column(length = 16, nullable = true, unique = false)
    public String tell;

    /** mapUrlプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String mapUrl;

    /** areaIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer areaId;

    /** areaDetailIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer areaDetailId;

    /** stationプロパティ */
    @Column(length = 32, nullable = false, unique = false)
    public String station;

    /** premiumFlgプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer premiumFlg;
}