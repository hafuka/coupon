package coupon.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MConfig}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/01/17 18:28:07")
public class MConfigNames {

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * valueのプロパティ名を返します。
     * 
     * @return valueのプロパティ名
     */
    public static PropertyName<String> value() {
        return new PropertyName<String>("value");
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
    public static class _MConfigNames extends PropertyName<MConfig> {

        /**
         * インスタンスを構築します。
         */
        public _MConfigNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MConfigNames(final String name) {
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
        public _MConfigNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * valueのプロパティ名を返します。
         *
         * @return valueのプロパティ名
         */
        public PropertyName<String> value() {
            return new PropertyName<String>(this, "value");
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