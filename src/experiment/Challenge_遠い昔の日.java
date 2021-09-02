package experiment;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 遠い昔の日
 * 2001 年 2 月 3 日の 4567 日前の日付を答えよ。
 * ※例えば答えが「1987 年 6 月 5 日」であれば「19870605」のように、8 桁の数字列で答えること。
 */
public class Challenge_遠い昔の日 {
  public static void main(String[] args) {
    // Calendarオブジェクト
    Calendar calendar = Calendar.getInstance();
    // 表示フォーマット
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

    calendar.set(2001, Calendar.FEBRUARY, 3);
    calendar.add(Calendar.DATE,-4567);
    System.out.println(simpleDateFormat.format(calendar.getTime()));
  }
}
