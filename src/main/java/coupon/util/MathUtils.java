package coupon.util;



/**
 * レースゲームを参考にしました。
 * 
 * @author berthold_alheit
 */
public final class MathUtils {

    /**
     * private constructor.. utility class conventions require this..
     */
    private MathUtils() {
    }

    /**
     * 範囲内のランダム数字を返す
     * 
     * @param min 最低値
     * @param max 最大値
     * 
     * @return ランダム数字
     */
    public static int getRandomRange(int min, int max) {
        return (min + (int) (Math.random() * ((max - min) + 1)));
    }

	public static int absNegative(int i) {
		if (i <= 0) {
			return i;
		}
		return i * -1;
	}

}
