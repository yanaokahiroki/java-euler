package leapYear;


import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * うるう年判定
 */
public class leapYear {
  public static void main(String[] args) {
    leapYearCheck();
    leapYearCheckWithCalender();
  }

  public static void leapYearCheck(){
    System.out.print("西暦を入力してください：");
    int year = new Scanner(System.in).nextInt();
    if (year % 4 == 0){
      if (year % 100 == 0) {
        if (year % 400 == 0){
          System.out.println("うるう年です");
        }
      } else {
        System.out.println("うるう年です");
      }
    }
  }

  /**
   * 引数で取得した年がうるう年か判定する
   *
   * @param year 西暦
   */
  public static boolean isLeapYear(int year){
    if (year % 4 == 0){
      if (year % 100 == 0) {
        if (year % 400 == 0){
          return true;
        }
      } else {
        return true;
      }
    }
    return false;
  }


  /**
   * Calenderクラスで簡単にうるう年チェック実装
   */
  public static void leapYearCheckWithCalender(){
    System.out.print("西暦を入力してください：");
    int year = new Scanner(System.in).nextInt();
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    if (gregorianCalendar.isLeapYear(year)) {
      System.out.println("うるう年です");
    } else {
      System.out.println("うるう年ではありません");
    }
  }
}
