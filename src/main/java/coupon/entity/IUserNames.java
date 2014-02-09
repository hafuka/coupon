package coupon.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link IUser}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/02/09 9:03:04")
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
     * emailのプロパティ名を返します。
     * 
     * @return emailのプロパティ名
     */
    public static PropertyName<String> email() {
        return new PropertyName<String>("email");
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
     * pointのプロパティ名を返します。
     * 
     * @return pointのプロパティ名
     */
    public static PropertyName<Long> point() {
        return new PropertyName<Long>("point");
    }

    /**
     * loginDatetimeのプロパティ名を返します。
     * 
     * @return loginDatetimeのプロパティ名
     */
    public static PropertyName<Timestamp> loginDatetime() {
        return new PropertyName<Timestamp>("loginDatetime");
    }

    /**
     * loginBonusDatetimeのプロパティ名を返します。
     * 
     * @return loginBonusDatetimeのプロパティ名
     */
    public static PropertyName<Timestamp> loginBonusDatetime() {
        return new PropertyName<Timestamp>("loginBonusDatetime");
    }

    /**
     * consecutiveDaysのプロパティ名を返します。
     * 
     * @return consecutiveDaysのプロパティ名
     */
    public static PropertyName<Long> consecutiveDays() {
        return new PropertyName<Long>("consecutiveDays");
    }

    /**
     * normalRouletteDatetimeのプロパティ名を返します。
     * 
     * @return normalRouletteDatetimeのプロパティ名
     */
    public static PropertyName<Timestamp> normalRouletteDatetime() {
        return new PropertyName<Timestamp>("normalRouletteDatetime");
    }

    /**
     * customerIdのプロパティ名を返します。
     * 
     * @return customerIdのプロパティ名
     */
    public static PropertyName<String> customerId() {
        return new PropertyName<String>("customerId");
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
         * emailのプロパティ名を返します。
         *
         * @return emailのプロパティ名
         */
        public PropertyName<String> email() {
            return new PropertyName<String>(this, "email");
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
         * pointのプロパティ名を返します。
         *
         * @return pointのプロパティ名
         */
        public PropertyName<Long> point() {
            return new PropertyName<Long>(this, "point");
        }

        /**
         * loginDatetimeのプロパティ名を返します。
         *
         * @return loginDatetimeのプロパティ名
         */
        public PropertyName<Timestamp> loginDatetime() {
            return new PropertyName<Timestamp>(this, "loginDatetime");
        }

        /**
         * loginBonusDatetimeのプロパティ名を返します。
         *
         * @return loginBonusDatetimeのプロパティ名
         */
        public PropertyName<Timestamp> loginBonusDatetime() {
            return new PropertyName<Timestamp>(this, "loginBonusDatetime");
        }

        /**
         * consecutiveDaysのプロパティ名を返します。
         *
         * @return consecutiveDaysのプロパティ名
         */
        public PropertyName<Long> consecutiveDays() {
            return new PropertyName<Long>(this, "consecutiveDays");
        }

        /**
         * normalRouletteDatetimeのプロパティ名を返します。
         *
         * @return normalRouletteDatetimeのプロパティ名
         */
        public PropertyName<Timestamp> normalRouletteDatetime() {
            return new PropertyName<Timestamp>(this, "normalRouletteDatetime");
        }

        /**
         * customerIdのプロパティ名を返します。
         *
         * @return customerIdのプロパティ名
         */
        public PropertyName<String> customerId() {
            return new PropertyName<String>(this, "customerId");
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