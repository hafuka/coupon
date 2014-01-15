package coupon.util;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang.time.DateUtils;

public class CouponDateUtils {
	
	
	public static final String HIFUN_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";
	
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
    
    /**
     * 日付差を取得
     * @param source 元の日時
     * @param target 比較対象の日時
     * @return 日付の差
     */
    public static int diffDays(Timestamp source, Timestamp target) {
    	
    	Date from = convertZeroHourDate(CouponDateUtils.toDate(source));
    	Date to = convertZeroHourDate(CouponDateUtils.toDate(target));
    	
    	// 日付をlong値に変換します。
        long dateTimeTo = to.getTime();
        long dateTimeFrom = from.getTime();
    	
        // 差分の日数を算出します。
        long dayDiff = ( dateTimeTo - dateTimeFrom  ) / (1000 * 60 * 60 * 24 );
    	return (int) (dayDiff);
    }
    
    /**
     * 与えられた日時の 00:00:00.000 Dateを返す
     * @param source
     */
    public static Date convertZeroHourDate(Date source) {
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(source);
    	cal.set(Calendar.HOUR_OF_DAY, 0);
    	cal.set(Calendar.MINUTE, 0);
    	cal.set(Calendar.SECOND, 0);
    	cal.set(Calendar.MILLISECOND, 0);
    	return cal.getTime();
	}
    
    /**
	 * 日付の加減算を行います。
	 * @param target 対象日付
	 * @param addNum 加減日数
	 * @param addKind 年、月、日、等々（Calendarのフィールド）
	 * @return 加減算の結果
	 */
	public static Timestamp add(Timestamp target , int addNum ,int addKind){
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(target);
		cal.add(addKind, addNum);
		return new Timestamp(new Date(cal.getTimeInMillis()).getTime());
	}
	
	/**
	 * TimestampからDateに変換する
	 * @param ts
	 * @return
	 */
	public static Date toDate (Timestamp ts) {
		if(ts == null){
			return null;
		}
		return new Date(ts.getTime());
	}
}
