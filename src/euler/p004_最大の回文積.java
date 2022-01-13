package euler;

/**
 * 「最大の回文積」 左右どちらから読んでも同じ値になる数を回文数という. 2桁の数の積で表される回文数のうち, 最大のものは 9009 = 91 × 99 である.
 *
 * <p>では, 3桁の数の積で表される回文数の最大値を求めよ.
 */
public class p004_最大の回文積 {
  public static void main(String[] args) {
    System.out.println(largestPalindrome(999, 999));
  }

  /**
   * reversedがリバースした後の数字、reducedが下1桁
   *
   * @param number 数
   * @return reversed反転させた数字
   */
  public static long reverse(long number) {
    long reversed = 0;
    long reduced;
    while (number > 0) {
      // reducedにnumberの下1桁を代入
      reduced = number % 10;
      // reversedを10倍したものにreducedを足してreversedに代入
      // これで反転される
      reversed = (reversed * 10) + reduced;
      // numberを10で割ってループすすめる
      number /= 10;
    }
    return reversed;
  }

  /**
   * 回文かどうか判定 reverseメソッドにnumberを入れて反転させる、 もしそれが元のnumberと同じ値なら回文になるのでtrueを返す
   *
   * @return true
   */
  public static boolean isPalindrome(long number) {
    return reverse(number) == number;
  }

  public static long largestPalindrome(long a, long b) {
    long result;
    long largest = 0;
    for (long x = a; x > 99; x--) {
      for (long y = b; y > 99; y--) {
        result = y * x;
        if (isPalindrome(result)) {
          largest = Math.max(largest, result);
        }
      }
    }
    return largest;
  }
}
