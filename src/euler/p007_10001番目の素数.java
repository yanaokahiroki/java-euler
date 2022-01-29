package euler;

import util.EulerUtil;

/**
 * 「10001番目の素数」 素数を小さい方から6つ並べると 2, 3, 5, 7, 11, 13 であり, 6番目の素数は 13 である.
 *
 * <p>10 001 番目の素数を求めよ.
 *
 * 104743
 */
public class p007_10001番目の素数 {
  public static void main(String[] args) {
    System.out.println(run(10001));
  }

  public static int run(int limit){
    int counter = 1;
    int result = 0;
    for (int i = 2; counter <= limit; i++){
      if (EulerUtil.isPrime(i)){
        result = i;
        counter++;
      }
    }
    return result;
  }
}
