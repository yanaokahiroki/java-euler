package experiment;

import java.math.BigInteger;

/**
 * 「各位の数字の和 2」 n × (n - 1) × ... × 3 × 2 × 1 を n! と表す.
 *
 * <p>例えば, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800 となる. この数の各桁の合計は 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27
 * である.
 *
 * <p>では, 100! の各位の数字の和を求めよ.
 */
public class p07 {
  public static void main(String[] args) {
    BigInteger factorial = BigInteger.ONE;
    for (int i = 1; i <= 100; i++){
      factorial = factorial.multiply(BigInteger.valueOf(i));
    }
    String stringFactorial = factorial.toString();
    String[] strings = stringFactorial.split("");
    int result = 0;
    for (String s: strings){
      result += Integer.parseInt(s);
    }
    System.out.println(result);
  }
}
