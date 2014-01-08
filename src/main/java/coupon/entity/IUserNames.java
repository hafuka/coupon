package coupon.entity;

import java.sql.Date;
import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link IUser}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/01/08 19:31:40")
public class IUserNames {

    /**
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<Long> userId() {
        return new PropertyName<Long>("userId");
    }

    /**
     * mailのプロパティ名を返します。
     * 
     * @return mailのプロパティ名
     */
    public static PropertyName<String> mail() {
        return new PropertyName<String>("mail");
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
     * updDatetimeのプロパティ名を返します。
     * 
     * @return updDatetimeのプロパティ名
     */
    public static PropertyName<Date> updDatetime() {
        return new PropertyName<Date>("updDatetime");
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
    public static class _IUserNames extends PropertyName<IUser> {

        /**
         * インスタンスを構築します。
         */
        public _IUserNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _IUserNames(final String name) {
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
        public _IUserNames(final PropertyName<?> parent, final String name) {
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
         * mailのプロパティ名を返します。
         *
         * @return mailのプロパティ名
         */
        public PropertyName<String> mail() {
            return new PropertyName<String>(this, "mail");
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
         * updDatetimeのプロパティ名を返します。
         *
         * @return updDatetimeのプロパティ名
         */
        public PropertyName<Date> updDatetime() {
            return new PropertyName<Date>(this, "updDatetime");
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