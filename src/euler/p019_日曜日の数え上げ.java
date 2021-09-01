package euler;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 「日曜日の数え上げ」
 * 次の情報が与えられている.
 *
 * <p>1900年1月1日は月曜日である. 9月, 4月, 6月, 11月は30日まであり, 2月を除く他の月は31日まである. 2月は28日まであるが, うるう年のときは29日である.
 * うるう年は西暦が4で割り切れる年に起こる. しかし, 西暦が400で割り切れず100で割り切れる年はうるう年でない.
 * 20世紀（1901年1月1日から2000年12月31日）中に月の初めが日曜日になるのは何回あるか?
 */
public class p019_日曜日の数え上げ {
  public static void main(String[] args) {
    System.out.println(run());
  }

  public static int run(){
    LocalDate localDate = LocalDate.of(1901,1,1);
    int count = 0;
    while (localDate.getYear() <= 2000){
      if (localDate.getDayOfWeek() == DayOfWeek.SUNDAY){
        count++;
      }
      localDate = localDate.plusMonths(1);
    }
    return count;
  }
}
