package euler;

public class p021_友愛数 {
  private static final int LIMIT = 10000;

  public static void main(String[] args){
    System.out.println(calcAmicableNumbersSum());
  }

  /**
   * 指定数までの親和数(友愛数)の和を計算する
   *
   * @return 親和数(友愛数)の和
   */
  public static int calcAmicableNumbersSum(){
    int amicableNumbersSum = 0;
    for (int index = 1; index < LIMIT; index++){
      if (isAmicableNumber(index)) amicableNumbersSum += index;
    }
    return amicableNumbersSum;
  }


  /**
   * 親和数(友愛数)であるかを判別する
   * d(a) = b かつ d(b) = a (a != b)の場合に親和数となる
   *
   * @param a 整数
   * @return true 親和数
   */
  private static boolean isAmicableNumber(int a){
    int b = calcDivisorsSum(a);
    return a != b && a == calcDivisorsSum(b);

  }

  /**
   * 整数numberの約数の和を計算する
   *
   * @param number 整数
   * @return 整数numberの約数の和
   */
  private static int calcDivisorsSum(int number) {
    // 約数の和
    int divisorSum = 0;
    for (int index = 1; index <= number / 2; index++){
      if (number % index == 0) {
        divisorSum += index;
      }
    }
    return divisorSum;
  }
}
