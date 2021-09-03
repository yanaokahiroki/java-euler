package test;

import java.math.BigInteger;

/**
 * 7の777乗を求めその中央9桁を求めよ。
 *
 */
public class p03 {
  public static void main(String[] args) {
    BigInteger number = BigInteger.valueOf(7).pow(777);
    System.out.println(number.toString().length() + "桁");
    // 中央は329桁目、前後4桁ずつなので抜き出すのは325~333桁目
    // しかしプログラム上は0から始まっているので324~332桁目
    // substringは第2引数を含まないので333を指定
    System.out.println(number.toString().substring(324,333));
  }
}
