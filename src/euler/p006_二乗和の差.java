package euler;

/**
 * 「二乗和の差」 最初の10個の自然数について, その二乗の和は,
 *
 * <p>12 + 22 + ... + 102 = 385 最初の10個の自然数について, その和の二乗は,
 *
 * <p>(1 + 2 + ... + 10)2 = 3025 これらの数の差は 3025 - 385 = 2640 となる.
 *
 * <p>同様にして, 最初の100個の自然数について二乗の和と和の二乗の差を求めよ.
 *
 * 式
 * result = (和の二乗) - (二乗の和)
 *
 */
public class p006_二乗和の差 {
  public static void main(String[] args){
    System.out.println(run());
  }

  public static int run(){
    // (和の二乗) - (二乗の和)
    return sumSquare() - squareSum();
  }

  /**
   * 二乗の和
   *
   * @return 二乗の和
   */
  private static int squareSum(){
    int squareSum = 0;
    for (int i = 1; i <= 100; i++){
      squareSum += i * i;
    }
    return squareSum;
  }

  /**
   * 和の二乗
   *
   * @return 和の二乗
   */
  private static int sumSquare(){
    int sum = 0;
    for (int i = 1; i <= 100; i++){
      sum += i;
    }
    return sum * sum;
  }

}
