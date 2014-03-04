package coupon.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link IAdminAuthentication}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/03/04 10:13:12")
public class IAdminAuthenticationNames {

    /**
     * shopIdのプロパティ名を返します。
     * 
     * @return shopIdのプロパティ名
     */
    public static PropertyName<Integer> shopId() {
        return new PropertyName<Integer>("shopId");
    }

    /**
     * emailのプロパティ名を返します。
     * 
     * @return emailのプロパティ名
     */
    public static PropertyName<String> email() {
        return new PropertyName<String>("email");
    }

    /**
     * passwordのプロパティ名を返します。
     * 
     * @return passwordのプロパティ名
     */
    public static PropertyName<String> password() {
        return new PropertyName<String>("password");
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
    public static class _IAdminAuthenticationNames extends PropertyName<IAdminAuthentication> {

        /**
         * インスタンスを構築します。
         */
        public _IAdminAuthenticationNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _IAdminAuthenticationNames(final String name) {
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
        public _IAdminAuthenticationNames(final PropertyName<?> parent, final String name) {
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
         * emailのプロパティ名を返します。
         *
         * @return emailのプロパティ名
         */
        public PropertyName<String> email() {
            return new PropertyName<String>(this, "email");
        }

        /**
         * passwordのプロパティ名を返します。
         *
         * @return passwordのプロパティ名
         */
        public PropertyName<String> password() {
            return new PropertyName<String>(this, "password");
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