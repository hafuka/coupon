package coupon.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MAreaDetail}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/01/17 18:28:07")
public class MAreaDetailNames {

    /**
     * areaIdのプロパティ名を返します。
     * 
     * @return areaIdのプロパティ名
     */
    public static PropertyName<Integer> areaId() {
        return new PropertyName<Integer>("areaId");
    }

    /**
     * areaDetailIdのプロパティ名を返します。
     * 
     * @return areaDetailIdのプロパティ名
     */
    public static PropertyName<Integer> areaDetailId() {
        return new PropertyName<Integer>("areaDetailId");
    }

    /**
     * detailNameのプロパティ名を返します。
     * 
     * @return detailNameのプロパティ名
     */
    public static PropertyName<String> detailName() {
        return new PropertyName<String>("detailName");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MAreaDetailNames extends PropertyName<MAreaDetail> {

        /**
         * インスタンスを構築します。
         */
        public _MAreaDetailNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MAreaDetailNames(final String name) {
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
        public _MAreaDetailNames(final PropertyName<?> parent, final String name) {
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
         * areaDetailIdのプロパティ名を返します。
         *
         * @return areaDetailIdのプロパティ名
         */
        public PropertyName<Integer> areaDetailId() {
            return new PropertyName<Integer>(this, "areaDetailId");
        }

        /**
         * detailNameのプロパティ名を返します。
         *
         * @return detailNameのプロパティ名
         */
        public PropertyName<String> detailName() {
            return new PropertyName<String>(this, "detailName");
        }
    }
}