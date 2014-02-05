package coupon.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link IUserCoupon}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/02/04 19:48:57")
public class IUserCouponNames {

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
     * couponTypeのプロパティ名を返します。
     * 
     * @return couponTypeのプロパティ名
     */
    public static PropertyName<Integer> couponType() {
        return new PropertyName<Integer>("couponType");
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
     * couponCountのプロパティ名を返します。
     * 
     * @return couponCountのプロパティ名
     */
    public static PropertyName<Integer> couponCount() {
        return new PropertyName<Integer>("couponCount");
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
         * couponTypeのプロパティ名を返します。
         *
         * @return couponTypeのプロパティ名
         */
        public PropertyName<Integer> couponType() {
            return new PropertyName<Integer>(this, "couponType");
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
         * couponCountのプロパティ名を返します。
         *
         * @return couponCountのプロパティ名
         */
        public PropertyName<Integer> couponCount() {
            return new PropertyName<Integer>(this, "couponCount");
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