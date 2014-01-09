package coupon.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MLoginBonus}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/01/09 16:45:54")
public class MLoginBonusNames {

    /**
     * bonusIdのプロパティ名を返します。
     * 
     * @return bonusIdのプロパティ名
     */
    public static PropertyName<Integer> bonusId() {
        return new PropertyName<Integer>("bonusId");
    }

    /**
     * bonusTypeのプロパティ名を返します。
     * 
     * @return bonusTypeのプロパティ名
     */
    public static PropertyName<Integer> bonusType() {
        return new PropertyName<Integer>("bonusType");
    }

    /**
     * pointのプロパティ名を返します。
     * 
     * @return pointのプロパティ名
     */
    public static PropertyName<Integer> point() {
        return new PropertyName<Integer>("point");
    }

    /**
     * consecutiveDaysのプロパティ名を返します。
     * 
     * @return consecutiveDaysのプロパティ名
     */
    public static PropertyName<Integer> consecutiveDays() {
        return new PropertyName<Integer>("consecutiveDays");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MLoginBonusNames extends PropertyName<MLoginBonus> {

        /**
         * インスタンスを構築します。
         */
        public _MLoginBonusNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MLoginBonusNames(final String name) {
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
        public _MLoginBonusNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * bonusIdのプロパティ名を返します。
         *
         * @return bonusIdのプロパティ名
         */
        public PropertyName<Integer> bonusId() {
            return new PropertyName<Integer>(this, "bonusId");
        }

        /**
         * bonusTypeのプロパティ名を返します。
         *
         * @return bonusTypeのプロパティ名
         */
        public PropertyName<Integer> bonusType() {
            return new PropertyName<Integer>(this, "bonusType");
        }

        /**
         * pointのプロパティ名を返します。
         *
         * @return pointのプロパティ名
         */
        public PropertyName<Integer> point() {
            return new PropertyName<Integer>(this, "point");
        }

        /**
         * consecutiveDaysのプロパティ名を返します。
         *
         * @return consecutiveDaysのプロパティ名
         */
        public PropertyName<Integer> consecutiveDays() {
            return new PropertyName<Integer>(this, "consecutiveDays");
        }
    }
}