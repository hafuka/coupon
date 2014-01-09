package coupon.util;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

public class CouponDateUtils {

	/**
	 * 現在日時取得
	 * @return
	 */
	public static Timestamp getCurrentDate() {
		return new Timestamp(System.currentTimeMillis());
	}
	
	/**
     * 今日かどうかを判定
     *
     * @param date 判定日時
     * @return dateが今日の場合true
     */
    public static boolean isToday(Timestamp date) {
        return DateUtils.isSameDay(getCurrentDate(), date);
    }
    
    /**
     * 指定日の指定時、分をもつ日時を返す
     *
     * @param targetDate 指定日
     * @param hour 指定時
     * @param minute 指定分
     * @return Date 指定日の指定時、分をもつ日時(秒, ミリ秒は0)
     */
    public static Timestamp getDateWithSpecifiedHourAndMinute(Date targetDate, int hour, int minute) {
    	Calendar c = Calendar.getInstance();
    	c.setTime(targetDate);
    	c.set(Calendar.HOUR_OF_DAY, hour);
    	c.set(Calendar.MINUTE, minute);
    	c.set(Calendar.SECOND, 0);
    	c.set(Calendar.MILLISECOND, 0);
    	return new Timestamp(c.getTimeInMillis());
    }
    
    /**
     * 指定された日数分の過去日付を取得する
     *
     * @param day 何日前か
     * @return 過去日（時間は00:00:00）
     */
    public static Timestamp getPastDate(Integer day) {
        Date date = DateUtils.addDays(getCurrentDate(), -day);
        return new Timestamp(DateUtils.truncate(date, Calendar.DATE).getTime());
    }
}
