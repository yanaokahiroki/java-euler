package experiment;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 遠い昔の日
 * 2001 年 2 月 3 日の 4567 日前の日付を答えよ。
 * ※例えば答えが「1987 年 6 月 5 日」であれば「19870605」のように、8 桁の数字列で答えること。
 */
public class CalendarDate {
  public static void main(String[] args) {
    // Calendarオブジェクトを生成します
    Calendar cal1 = Calendar.getInstance();

    // 表示用フォーマットを設定します
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");

    // set
    cal1.set(2001, 1, 3,0,0,0);
    System.out.println(sdf1.format(cal1.getTime()));
    cal1.add(Calendar.DATE,-4567);
    System.out.println(sdf1.format(cal1.getTime()));
  }
}
