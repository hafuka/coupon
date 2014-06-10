package coupon.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang.time.DateUtils;

public class CouponDateUtils {


	public static final String HIFUN_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";
	public static final String SLASH_YYYYMMDDHHMMSS = "yyyy/MM/dd HH:mm:ss";

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

	/**
     * targetDateまでの残り日にちを返す
     *
     * @param targetDate 終了時間
     * @return Long
     */
    public static Long getRemainDays(Date targetDate) {
    	if (targetDate == null) {
    		return null;
    	}
        long diffTime = targetDate.getTime() - System.currentTimeMillis();
        if (diffTime > 0) {
            // 秒/分/時/日
            long second = diffTime / 1000;
            long minute = second / 60;
            long hour = minute / 60;
            long day = hour / 24;
            return day;
        }
        return null;
    }

    /**
     * targetDateまでの残り時間を返す(24時間を超える部分は除く)
     *
     * @param targetDate 終了時間
     * @return Long
     */
    public static Long getRemainHours(Date targetDate) {
        long diffTime = targetDate.getTime() - System.currentTimeMillis();
        if (diffTime > 0) {
            // 秒/分/時/日
            long second = diffTime / 1000;
            long minute = second / 60;
            long hour = minute / 60;
            long day = hour / 24;
            if ((hour - (24 * day)) > 0 && ((hour % 24) > 0)) {
                return hour - (24 * day);
            } else {
            	return 0L;
            }
        }
        return null;
    }

    /**
     * targetDateまでの残り秒を返す(60秒を超える部分は除く)
     *
     * @param targetDate 終了時間
     * @return Long
     */
    public static Long getRemainSeconds(Date targetDate) {
        long diffTime = targetDate.getTime() - System.currentTimeMillis();
        if (diffTime > 0) {
            // 秒/分/時/日
            long second = diffTime / 1000;
            long minute = second / 60;
            if ((second - (60 * minute)) > 0 && ((second % 60) > 0)) {
                return second - (60 * minute);
            } else {
            	return 0L;
            }
        }
        return null;
    }

    /**
     * targetDateまでの残り分を返す(60分を超える部分は除く)
     *
     * @param targetDate 終了時間
     * @return Long
     */
    public static Long getRemainMinutes(Date targetDate) {
        long diffTime = targetDate.getTime() - System.currentTimeMillis();
        if (diffTime > 0) {
            // 秒/分/時/日
            long second = diffTime / 1000;
            long minute = second / 60;
            long hour = minute / 60;
            if ((minute - (60 * hour)) > 0 && ((minute % 60) > 0)) {
                return minute - (60 * hour);
            } else {
            	return 0L;
            }
        }
        return null;
    }

    /**
     * 指定された日付より現在が過去なのか判定
     * @param targetDate 対象日時
     * @return 判定結果. 対象日時と現在日時が同じ場合true.
     */
    public static boolean isBefore(Date targetDate) {
        long target = targetDate != null ? targetDate.getTime() / 1000L : Long.MIN_VALUE;
        long now = getCurrentDate().getTime() / 1000L;
        return target >= now;
    }

    /**
     * 対象日時が基準日時以降か判定する。
     * @param baseDate 基準時間
     * @param targetDate 対象日付
     * @return 判定結果
     */
    public static boolean isAfter(Date baseDate ,Date targetDate) {
        long target = targetDate != null ? targetDate.getTime() / 1000L : Long.MIN_VALUE;
        long base = baseDate.getTime() / 1000L;
        return target >= base;
    }

    /**
     * 今日が、指定された開始日時、終了日時の期間内かどうかを判定する
     *
     * <pre>
     * 秒単位まで確認し、境界を含む
     * 開始日時が nullの場合、最小値。 終了日時が nullの場合、最大値として判断する
     * </pre>
     *
     * @param startDate 開始日時
     * @param endDate 終了日時
     * @return 判定結果
     */
    public static boolean isWithin(Date startDate, Date endDate) {
        long start = startDate != null ? startDate.getTime() / 1000L : Long.MIN_VALUE;
        long end = endDate != null ? endDate.getTime() / 1000L : Long.MAX_VALUE;
        long now = getCurrentDate().getTime() / 1000L;
        return start <= now && now <= end;
    }


    public static String toString(Date date, String format) {
    	if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
    }
}
