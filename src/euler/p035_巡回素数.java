package euler;

import experiment.MyLibrary;

/**
 * 「巡回素数」
 * 197は巡回素数と呼ばれる. 桁を回転させたときに得られる数 197, 971, 719 が全て素数だからである.
 *
 * <p>100未満には巡回素数が13個ある: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, および97である.
 *
 * <p>100万未満の巡回素数はいくつあるか?
 */
public class p035_巡回素数 {
  public static void main(String[] args) {
    System.out.println(run());
  }

  private static int run(){
    int counter = 0;
    for (int i = 2; i < 1000000; i++){
      if (isPatrolPrime(i)){
        counter++;
      }
    }
    return counter;
  }

  private static boolean isPatrolPrime(int number){
    String s = String.valueOf(number);
    for (int i = 0; i < s.length(); i++) {
      if (!MyLibrary.isPrime(Integer.parseInt(s.substring(i) + s.substring(0, i)))) {
        return false;
      }
    }
    return true;
  }
}
