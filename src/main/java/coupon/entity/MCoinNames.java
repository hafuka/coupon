package coupon.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MCoin}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/02/26 13:04:00")
public class MCoinNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
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
     * yenのプロパティ名を返します。
     * 
     * @return yenのプロパティ名
     */
    public static PropertyName<Integer> yen() {
        return new PropertyName<Integer>("yen");
    }

    /**
     * startDatetimeのプロパティ名を返します。
     * 
     * @return startDatetimeのプロパティ名
     */
    public static PropertyName<Timestamp> startDatetime() {
        return new PropertyName<Timestamp>("startDatetime");
    }

    /**
     * endDatetimeのプロパティ名を返します。
     * 
     * @return endDatetimeのプロパティ名
     */
    public static PropertyName<Timestamp> endDatetime() {
        return new PropertyName<Timestamp>("endDatetime");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MCoinNames extends PropertyName<MCoin> {

        /**
         * インスタンスを構築します。
         */
        public _MCoinNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MCoinNames(final String name) {
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
        public _MCoinNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
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
         * yenのプロパティ名を返します。
         *
         * @return yenのプロパティ名
         */
        public PropertyName<Integer> yen() {
            return new PropertyName<Integer>(this, "yen");
        }

        /**
         * startDatetimeのプロパティ名を返します。
         *
         * @return startDatetimeのプロパティ名
         */
        public PropertyName<Timestamp> startDatetime() {
            return new PropertyName<Timestamp>(this, "startDatetime");
        }

        /**
         * endDatetimeのプロパティ名を返します。
         *
         * @return endDatetimeのプロパティ名
         */
        public PropertyName<Timestamp> endDatetime() {
            return new PropertyName<Timestamp>(this, "endDatetime");
        }
    }
}