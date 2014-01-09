package coupon.enums;

/**
 * ログインボーナス区分
 *
 */
public enum LoginBonusType {
    /** 基本ボーナス */
    BASIC(1),
    ;

    /** DB上の区分 */
    private Integer key;

    private LoginBonusType(Integer key) {
        this.key = key;
    }

    /**
     * DB上の区分値を返す
     *
     * @return
     */
    public Integer getKey() {
        return key;
    }

    /**
     * DB上の区分値よりenumを生成する
     *
     * @param key
     * @return
     */
    public static LoginBonusType valueOf(Integer key) {
        for (LoginBonusType type : LoginBonusType.values()) {
            if (type.key.equals(key)) {
                return type;
            }
        }
        throw new IllegalArgumentException("no such key " + key);
    }
}