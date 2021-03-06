package coupon.entity;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link IUserCoin}のプロパティ名の集合です。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/03/04 10:13:12")
public class IUserCoinNames {

    /**
     * userIdのプロパティ名を返します。
     *
     * @return userIdのプロパティ名
     */
    public static PropertyName<Long> userId() {
        return new PropertyName<Long>("userId");
    }

    /**
     * idのプロパティ名を返します。
     *
     * @return userIdのプロパティ名
     */
    public static PropertyName<Long> id() {
        return new PropertyName<Long>("id");
    }

    /**
     * coinのプロパティ名を返します。
     *
     * @return coinのプロパティ名
     */
    public static PropertyName<Integer> coin() {
        return new PropertyName<Integer>("coin");
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
    public static class _IUserCoinNames extends PropertyName<IUserCoin> {

        /**
         * インスタンスを構築します。
         */
        public _IUserCoinNames() {
        }

        /**
         * インスタンスを構築します。
         *
         * @param name
         *            名前
         */
        public _IUserCoinNames(final String name) {
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
        public _IUserCoinNames(final PropertyName<?> parent, final String name) {
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
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Long> id() {
            return new PropertyName<Long>(this, "id");
        }

        /**
         * coinのプロパティ名を返します。
         *
         * @return coinのプロパティ名
         */
        public PropertyName<Integer> coin() {
            return new PropertyName<Integer>(this, "coin");
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