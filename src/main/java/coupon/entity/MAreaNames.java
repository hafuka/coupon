package coupon.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MArea}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/02/27 19:55:41")
public class MAreaNames {

    /**
     * areaIdのプロパティ名を返します。
     * 
     * @return areaIdのプロパティ名
     */
    public static PropertyName<Integer> areaId() {
        return new PropertyName<Integer>("areaId");
    }

    /**
     * areaNameのプロパティ名を返します。
     * 
     * @return areaNameのプロパティ名
     */
    public static PropertyName<String> areaName() {
        return new PropertyName<String>("areaName");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MAreaNames extends PropertyName<MArea> {

        /**
         * インスタンスを構築します。
         */
        public _MAreaNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MAreaNames(final String name) {
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
        public _MAreaNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * areaNameのプロパティ名を返します。
         *
         * @return areaNameのプロパティ名
         */
        public PropertyName<String> areaName() {
            return new PropertyName<String>(this, "areaName");
        }
    }
}