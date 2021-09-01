package euler;

/**
 * 「二種類の基数による回文数」 585 = 10010010012 (2進) は10進でも2進でも回文数である.
 *
 * <p>100万未満で10進でも2進でも回文数になるような数の総和を求めよ.
 *
 * <p>(注: 先頭に0を含めて回文にすることは許されない.)
 */
public class p036_二種類の基数による回文数 {
  public static void main(String[] args) {
    System.out.println(run());
  }

  public static int run(){
    int sum = 0;
    for (int i = 1; i < 1000000; i++) {
      if (i % 10 != 0 && i % 10 != 2
              && isPalindrome(String.valueOf(i))
              && isPalindrome(Integer.toBinaryString(i))) {
        sum += i;
      }
    }
    return sum;
  }

  private static boolean isPalindrome(String s){
    return s.equals(new StringBuilder(s).reverse().toString());
  }
}
