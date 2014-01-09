package coupon.util;

import java.sql.Timestamp;

public class DateUtils {

	/**
	 * 現在日時取得
	 * @return
	 */
	public static Timestamp getCurrentDate() {
		return new Timestamp(System.currentTimeMillis());
	}
	
}
