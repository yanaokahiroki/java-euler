package euler;

import java.math.BigInteger;

/**
 * 「各位の数字の和 2」 n × (n - 1) × ... × 3 × 2 × 1 を n! と表す.
 *
 * <p>例えば, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800 となる. この数の各桁の合計は 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27
 * である.
 *
 * <p>では, 100! の各位の数字の和を求めよ.
 */
public class p020_各位の数字の和_2 {
  public static void main(String[] args) {
    System.out.println(run());
  }

  /**
   * 階乗
   *
   * @param n
   * @return
   */
  public static BigInteger calcFactorial(int n){
    BigInteger bigInteger = BigInteger.ONE;
    for (int i = 1; i <= n; i++){
      bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
    }
    return bigInteger;
  }

  public static int run(){
    String factorial = calcFactorial(100).toString();
    String[] factorialArray = factorial.split("");
    int sum = 0;
    for (String digit:factorialArray){
      sum += Integer.parseInt(digit);
    }
    return sum;
  }


}
