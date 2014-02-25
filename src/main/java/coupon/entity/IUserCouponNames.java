package coupon.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link IUserCoupon}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/02/25 18:19:11")
public class IUserCouponNames {

    /**
     * userCouponIdのプロパティ名を返します。
     * 
     * @return userCouponIdのプロパティ名
     */
    public static PropertyName<String> userCouponId() {
        return new PropertyName<String>("userCouponId");
    }

    /**
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<Long> userId() {
        return new PropertyName<Long>("userId");
    }

    /**
     * shopIdのプロパティ名を返します。
     * 
     * @return shopIdのプロパティ名
     */
    public static PropertyName<Integer> shopId() {
        return new PropertyName<Integer>("shopId");
    }

    /**
     * couponIdのプロパティ名を返します。
     * 
     * @return couponIdのプロパティ名
     */
    public static PropertyName<Integer> couponId() {
        return new PropertyName<Integer>("couponId");
    }

    /**
     * limitDatetimeのプロパティ名を返します。
     * 
     * @return limitDatetimeのプロパティ名
     */
    public static PropertyName<Timestamp> limitDatetime() {
        return new PropertyName<Timestamp>("limitDatetime");
    }

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * descriptionのプロパティ名を返します。
     * 
     * @return descriptionのプロパティ名
     */
    public static PropertyName<String> description() {
        return new PropertyName<String>("description");
    }

    /**
     * updDatetimeのプロパティ名を返します。
     * 
     * @return updDatetimeのプロパティ名
     */
    public static PropertyName<Timestamp> updDatetime() {
        return new PropertyName<Timestamp>("updDatetime");
    }

    /**
     * insDatetimeのプロパティ名を返します。
     * 
     * @return insDatetimeのプロパティ名
     */
    public static PropertyName<Timestamp> insDatetime() {
        return new PropertyName<Timestamp>("insDatetime");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _IUserCouponNames extends PropertyName<IUserCoupon> {

        /**
         * インスタンスを構築します。
         */
        public _IUserCouponNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _IUserCouponNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _IUserCouponNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * userCouponIdのプロパティ名を返します。
         *
         * @return userCouponIdのプロパティ名
         */
        public PropertyName<String> userCouponId() {
            return new PropertyName<String>(this, "userCouponId");
        }

        /**
         * userIdのプロパティ名を返します。
         *
         * @return userIdのプロパティ名
         */
        public PropertyName<Long> userId() {
            return new PropertyName<Long>(this, "userId");
        }

        /**
         * shopIdのプロパティ名を返します。
         *
         * @return shopIdのプロパティ名
         */
        public PropertyName<Integer> shopId() {
            return new PropertyName<Integer>(this, "shopId");
        }

        /**
         * couponIdのプロパティ名を返します。
         *
         * @return couponIdのプロパティ名
         */
        public PropertyName<Integer> couponId() {
            return new PropertyName<Integer>(this, "couponId");
        }

        /**
         * limitDatetimeのプロパティ名を返します。
         *
         * @return limitDatetimeのプロパティ名
         */
        public PropertyName<Timestamp> limitDatetime() {
            return new PropertyName<Timestamp>(this, "limitDatetime");
        }

        /**
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * descriptionのプロパティ名を返します。
         *
         * @return descriptionのプロパティ名
         */
        public PropertyName<String> description() {
            return new PropertyName<String>(this, "description");
        }

        /**
         * updDatetimeのプロパティ名を返します。
         *
         * @return updDatetimeのプロパティ名
         */
        public PropertyName<Timestamp> updDatetime() {
            return new PropertyName<Timestamp>(this, "updDatetime");
        }

        /**
         * insDatetimeのプロパティ名を返します。
         *
         * @return insDatetimeのプロパティ名
         */
        public PropertyName<Timestamp> insDatetime() {
            return new PropertyName<Timestamp>(this, "insDatetime");
        }
    }
}