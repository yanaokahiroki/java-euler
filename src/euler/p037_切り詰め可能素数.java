package euler;

import util.EulerUtil;

/**
 * 「切り詰め可能素数」
 * 3797は面白い性質を持っている. まずそれ自身が素数であり, 左から右に桁を除いたときに全て素数になっている (3797, 797, 97, 7).
 * 同様に右から左に桁を除いたときも全て素数である (3797, 379, 37, 3).
 *
 * <p>右から切り詰めても左から切り詰めても素数になるような素数は11個しかない. 総和を求めよ.
 *
 * <p>注: 2, 3, 5, 7を切り詰め可能な素数とは考えない.
 */
public class p037_切り詰め可能素数 {
  public static void main(String[] args) {
    System.out.println(run());
  }

  private static long run(){
    // 求める総和
    long sum = 0;
    int count = 0;
    for (int i = 10; count < 11; i++){
      if (isTractablePrime(i)){
        sum += i;
        count++;
      }
    }
    return sum;
  }

  /**
   * 左から右に桁を除いたとき
   *  (3797, 797, 97, 7)
   *  下ケタからとるから余りを入れていく
   *
   *
   * @param number 数字
   * @return 全部素数ならtrue
   */
  private static boolean isTractablePrime(int number){
    // Left-to-Right
    for (long i = 10; i <= number; i*=10){
      if (!EulerUtil.isPrime(number % (int)i)){
        return false;
      }
    }

    // Right-to-Left
    for (; number != 0; number /= 10) {
      if (!EulerUtil.isPrime(number))
        return false;
    }

    return true;
  }
}
