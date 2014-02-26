package coupon.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link IUserLogin}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/02/26 15:41:07")
public class IUserLoginNames {

    /**
     * cookieValueのプロパティ名を返します。
     * 
     * @return cookieValueのプロパティ名
     */
    public static PropertyName<String> cookieValue() {
        return new PropertyName<String>("cookieValue");
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
    public static class _IUserLoginNames extends PropertyName<IUserLogin> {

        /**
         * インスタンスを構築します。
         */
        public _IUserLoginNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _IUserLoginNames(final String name) {
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
        public _IUserLoginNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * cookieValueのプロパティ名を返します。
         *
         * @return cookieValueのプロパティ名
         */
        public PropertyName<String> cookieValue() {
            return new PropertyName<String>(this, "cookieValue");
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
         * insDatetimeのプロパティ名を返します。
         *
         * @return insDatetimeのプロパティ名
         */
        public PropertyName<Timestamp> insDatetime() {
            return new PropertyName<Timestamp>(this, "insDatetime");
        }
    }
}