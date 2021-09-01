package experiment;

/**
 * 「最小の倍数」 2520 は 1 から 10 の数字の全ての整数で割り切れる数字であり, そのような数字の中では最小の値である.
 *
 * <p>では, 1 から 20 までの整数全てで割り切れる数字の中で最小の正の数はいくらになるか.
 */

public class p03 {
  public static void main(String[] args) {
    int result = 0;
    for (int i = 2520; ; i++){
      if (isDivide(i)){
        result = i;
        break;
      }
    }
    System.out.println(result);
  }

  private static boolean isDivide(int number){
    for (int i = 1; i <= 20; i++){
      if (number % i != 0){
        return false;
      }
    }
    return true;
  }
}
