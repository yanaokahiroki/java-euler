package euler;

import util.EulerUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 「最大の素因数」 13195 の素因数は 5, 7, 13, 29 である.
 *
 * <p>600851475143 の素因数のうち最大のものを求めよ.
 */
public class p003_最大の素因数 {
  public static void main(String[] args){
    System.out.println(run(600851475143L));
  }

  /**
   * numberを整数で割り切れたらListに追加していく
   * 素因数ならListに追加
   * 素因数：対象の数を割り切れる(因数)　かつ　その因数が素数
   * Listのまま返すことで最小の素因数も把握できるし、
   * その素因数の和も求めやすい
   *
   * @param number 整数
   * @return List
   */
  public static List<Integer> run(long number) {
    List<Integer> factorList = new ArrayList<>();
    long sqrt = (long)Math.sqrt(number);
    for (int i = 2; i <= sqrt; i++){
      if (number % i == 0 && EulerUtil.isPrime(i)){
        factorList.add(i);
      }
    }
    return factorList;
  }
}
