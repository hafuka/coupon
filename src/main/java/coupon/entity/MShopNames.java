package coupon.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MShop}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/01/08 19:31:40")
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
     * shopCategoryのプロパティ名を返します。
     * 
     * @return shopCategoryのプロパティ名
     */
    public static PropertyName<Integer> shopCategory() {
        return new PropertyName<Integer>("shopCategory");
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
         * shopCategoryのプロパティ名を返します。
         *
         * @return shopCategoryのプロパティ名
         */
        public PropertyName<Integer> shopCategory() {
            return new PropertyName<Integer>(this, "shopCategory");
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
    }
}