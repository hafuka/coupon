package coupon.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MShopCoupon}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/01/08 13:48:21")
public class MShopCouponNames {

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
     * couponNameのプロパティ名を返します。
     * 
     * @return couponNameのプロパティ名
     */
    public static PropertyName<String> couponName() {
        return new PropertyName<String>("couponName");
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
     * probabilityのプロパティ名を返します。
     * 
     * @return probabilityのプロパティ名
     */
    public static PropertyName<Integer> probability() {
        return new PropertyName<Integer>("probability");
    }

    /**
     * limitDaysのプロパティ名を返します。
     * 
     * @return limitDaysのプロパティ名
     */
    public static PropertyName<Integer> limitDays() {
        return new PropertyName<Integer>("limitDays");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MShopCouponNames extends PropertyName<MShopCoupon> {

        /**
         * インスタンスを構築します。
         */
        public _MShopCouponNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MShopCouponNames(final String name) {
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
        public _MShopCouponNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * couponNameのプロパティ名を返します。
         *
         * @return couponNameのプロパティ名
         */
        public PropertyName<String> couponName() {
            return new PropertyName<String>(this, "couponName");
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
         * probabilityのプロパティ名を返します。
         *
         * @return probabilityのプロパティ名
         */
        public PropertyName<Integer> probability() {
            return new PropertyName<Integer>(this, "probability");
        }

        /**
         * limitDaysのプロパティ名を返します。
         *
         * @return limitDaysのプロパティ名
         */
        public PropertyName<Integer> limitDays() {
            return new PropertyName<Integer>(this, "limitDays");
        }
    }
}