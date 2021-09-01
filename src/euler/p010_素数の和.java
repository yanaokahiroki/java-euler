package euler;

import java.math.BigInteger;

/**
 * 「素数の和」
 * 10以下の素数の和は 2 + 3 + 5 + 7 = 17 である.
 *
 * <p>200万以下の全ての素数の和を求めよ.
 */
public class p010_素数の和 {
  public static void main(String[] args){
    System.out.println(calcSumOfPrime(2000000));
  }

  /**
   * int型数値が素数であるか判定
   *
   * @param number 数値
   * @return true 素数である
   */
  public static boolean isPrimeNumber(int number) {
    for (int index = 2; index <= Math.sqrt(number); index++){
      if (number % index == 0) return false;
    }
    return true;
  }

  /**
   * 設定値までループを回し数値が素数である場合、合計に加算していく。
   * ハマった点：素数の総和をint型で定義していたがintでは収まらず途中で溢れてしまっていた。
   * long型に変更することで解消。
   *
   * 2を特別扱いする。
   * ループの数値を3から2ずつ増やしていくことで素数とならない偶数を省くことができる。
   * またこれにより偶数が取り除かれるため設定値に対して計算量は半減する。
   *
   *
   * @param limit 設定値
   * @return 素数の総和
   */
  public static BigInteger calcSumOfPrime(int limit){
    BigInteger sumOfPrime = BigInteger.ZERO;
    for(int i = 3; i < limit; i += 2){
      if (isPrimeNumber(i)) {
        sumOfPrime = sumOfPrime.add(BigInteger.valueOf(i));
      }
    }
    return sumOfPrime;
  }
}
