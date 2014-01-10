package coupon.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MShop}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/01/10 18:41:12")
public class MShopNames {

    /**
     * shopIdのプロパティ名を返します。
     * 
     * @return shopIdのプロパティ名
     */
    public static PropertyName<Integer> shopId() {
        return new PropertyName<Integer>("shopId");
    }

    /**
     * businessIdのプロパティ名を返します。
     * 
     * @return businessIdのプロパティ名
     */
    public static PropertyName<Integer> businessId() {
        return new PropertyName<Integer>("businessId");
    }

    /**
     * shopNameのプロパティ名を返します。
     * 
     * @return shopNameのプロパティ名
     */
    public static PropertyName<String> shopName() {
        return new PropertyName<String>("shopName");
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
     * urlのプロパティ名を返します。
     * 
     * @return urlのプロパティ名
     */
    public static PropertyName<String> url() {
        return new PropertyName<String>("url");
    }

    /**
     * tellのプロパティ名を返します。
     * 
     * @return tellのプロパティ名
     */
    public static PropertyName<String> tell() {
        return new PropertyName<String>("tell");
    }

    /**
     * mapUrlのプロパティ名を返します。
     * 
     * @return mapUrlのプロパティ名
     */
    public static PropertyName<String> mapUrl() {
        return new PropertyName<String>("mapUrl");
    }

    /**
     * areaIdのプロパティ名を返します。
     * 
     * @return areaIdのプロパティ名
     */
    public static PropertyName<Integer> areaId() {
        return new PropertyName<Integer>("areaId");
    }

    /**
     * areaDetailIdのプロパティ名を返します。
     * 
     * @return areaDetailIdのプロパティ名
     */
    public static PropertyName<Integer> areaDetailId() {
        return new PropertyName<Integer>("areaDetailId");
    }

    /**
     * stationのプロパティ名を返します。
     * 
     * @return stationのプロパティ名
     */
    public static PropertyName<String> station() {
        return new PropertyName<String>("station");
    }

    /**
     * premiumFlgのプロパティ名を返します。
     * 
     * @return premiumFlgのプロパティ名
     */
    public static PropertyName<Integer> premiumFlg() {
        return new PropertyName<Integer>("premiumFlg");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MShopNames extends PropertyName<MShop> {

        /**
         * インスタンスを構築します。
         */
        public _MShopNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MShopNames(final String name) {
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
        public _MShopNames(final PropertyName<?> parent, final String name) {
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
         * businessIdのプロパティ名を返します。
         *
         * @return businessIdのプロパティ名
         */
        public PropertyName<Integer> businessId() {
            return new PropertyName<Integer>(this, "businessId");
        }

        /**
         * shopNameのプロパティ名を返します。
         *
         * @return shopNameのプロパティ名
         */
        public PropertyName<String> shopName() {
            return new PropertyName<String>(this, "shopName");
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
         * urlのプロパティ名を返します。
         *
         * @return urlのプロパティ名
         */
        public PropertyName<String> url() {
            return new PropertyName<String>(this, "url");
        }

        /**
         * tellのプロパティ名を返します。
         *
         * @return tellのプロパティ名
         */
        public PropertyName<String> tell() {
            return new PropertyName<String>(this, "tell");
        }

        /**
         * mapUrlのプロパティ名を返します。
         *
         * @return mapUrlのプロパティ名
         */
        public PropertyName<String> mapUrl() {
            return new PropertyName<String>(this, "mapUrl");
        }

        /**
         * areaIdのプロパティ名を返します。
         *
         * @return areaIdのプロパティ名
         */
        public PropertyName<Integer> areaId() {
            return new PropertyName<Integer>(this, "areaId");
        }

        /**
         * areaDetailIdのプロパティ名を返します。
         *
         * @return areaDetailIdのプロパティ名
         */
        public PropertyName<Integer> areaDetailId() {
            return new PropertyName<Integer>(this, "areaDetailId");
        }

        /**
         * stationのプロパティ名を返します。
         *
         * @return stationのプロパティ名
         */
        public PropertyName<String> station() {
            return new PropertyName<String>(this, "station");
        }

        /**
         * premiumFlgのプロパティ名を返します。
         *
         * @return premiumFlgのプロパティ名
         */
        public PropertyName<Integer> premiumFlg() {
            return new PropertyName<Integer>(this, "premiumFlg");
        }
    }
}