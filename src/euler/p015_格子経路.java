package euler;

import java.math.BigInteger;

/**
 * 「格子経路」 2×2 のマス目の左上からスタートした場合, 引き返しなしで右下にいくルートは 6 つある.
 *
 * <p>では, 20×20 のマス目ではいくつのルートがあるか.
 */
public class p015_格子経路 {
  // ルートの総ステップ数
  public static final int NUMBER_OF_STEPS = 40;
  // ルートの内、右に進むステップ数
  public static final int NUMBER_OF_RIGHT_STEPS = 20;

  public static void main(String[] args){
    System.out.println("全ルート数：" + getFactorial(NUMBER_OF_STEPS).divide(getFactorial(NUMBER_OF_RIGHT_STEPS).multiply(getFactorial(NUMBER_OF_STEPS - NUMBER_OF_RIGHT_STEPS))));
  }

  /**
   * 引数nの階乗を計算する
   *
   * @param n 非負整数
   * @return nの階乗
   */
  public static BigInteger getFactorial(int n) {
    if (n < 0) throw new IllegalArgumentException("引数nが負数です。正整数で入力してください。");
    BigInteger factorial = BigInteger.ONE;
    for (int i = 1; i <= n; i++) factorial = factorial.multiply(BigInteger.valueOf(n));
    return factorial;
  }
}
