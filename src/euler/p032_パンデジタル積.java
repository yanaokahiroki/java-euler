package euler;

import java.util.Arrays;

public class p032_パンデジタル積 {
  public static void main(String[] args) {
    System.out.println("The answer is " + run() + ".");
  }


  /**
   * 積nは5桁になることはないため9999までループを回す
   *
   *
   * @return PanDigitalの数式の積の総和
   */
  private static int run(){
    int sum = 0;
    for (int i = 0; i < 10000; i++){
      if (hasPanDigitalProduct(i)){
        sum += i;
      }
    }
    return sum;
  }

  /**
   * 引数n(積)に対してかけられる数とかける数がnの約数であり、
   * それがPanDigitalであるかどうかを判定
   *
   * (n / i) * i = n
   *
   * @param n 積
   * @return PanDigitalならtrue
   */
  private static boolean hasPanDigitalProduct(int n){
    for (int i = 1; i <= n; i++){
      if (n % i == 0 && isPanDigital("" +n + i + n/i)){
        return true;
      }
    }
    return false;
  }

  /**
   * 文字列Stringがソート後に123456789であるかどうか判定
   * つまりPanDigitalなのか判定
   *
   * @param string 文字列(数式のうち数字のみを文字列にしたもの)
   * @return PanDigitalであればtrue
   */
  private static boolean isPanDigital(String string){
    if (string.length() != 9) return false;
    char[] chars = string.toCharArray();
    Arrays.sort(chars);
    return new String(chars).equals("123456789");
  }
}
