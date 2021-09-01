package euler;

import java.math.BigInteger;

/**
 * 「各位の数字の和」 215 = 32768 であり, 各位の数字の和は 3 + 2 + 7 + 6 + 8 = 26 となる.
 *
 * <p>同様にして, 2^1000 の各位の数字の和を求めよ.
 *
 * <p>注: Problem 20 も各位の数字の和に関する問題です。解いていない方は解いてみてください。
 */
public class p016_各位の数字の和 {
  private static final int VALUE = 2;
  private static final int POWER = 1000;

  public static void main(String[] args){
    System.out.println(calcExponentiationSum());
  }

  /**
   * 累乗を計算する
   *
   * @param value 底
   * @param power 指数
   * @return 累乗
   */
  public static BigInteger calcExponentiation(int value, int power){
     return BigInteger.valueOf(value).pow(power);
  }

  /**
   * 累乗結果を1桁ずつに分解してその総和を計算する
   *
   * @return 総和
   */
  public static int calcExponentiationSum(){
    String exponentiation = calcExponentiation(VALUE,POWER).toString();
    String[] exponentiationArray = exponentiation.split("");
    int allSum = 0;
    for (String sum:exponentiationArray) {
      allSum += Integer.parseInt(sum);
    }
    return allSum;
  }


}
