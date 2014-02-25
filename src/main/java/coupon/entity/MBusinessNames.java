package coupon.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MBusiness}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/02/25 11:38:42")
public class MBusinessNames {

    /**
     * businessIdのプロパティ名を返します。
     * 
     * @return businessIdのプロパティ名
     */
    public static PropertyName<Integer> businessId() {
        return new PropertyName<Integer>("businessId");
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
     * @author S2JDBC-Gen
     */
    public static class _MBusinessNames extends PropertyName<MBusiness> {

        /**
         * インスタンスを構築します。
         */
        public _MBusinessNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MBusinessNames(final String name) {
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
        public _MBusinessNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }
    }
}