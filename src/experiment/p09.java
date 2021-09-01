package experiment;

/**
 * 「各桁の5乗」 驚くべきことに, 各桁を4乗した数の和が元の数と一致する数は3つしかない.
 *
 * <p>1634 = 14 + 64 + 34 + 44 8208 = 84 + 24 + 04 + 84 9474 = 94 + 44 + 74 + 44 ただし,
 * 1=14は含まないものとする. この数たちの和は 1634 + 8208 + 9474 = 19316 である.
 *
 * <p>各桁を5乗した数の和が元の数と一致するような数の総和を求めよ.
 */
public class p09 {
  public static void main(String[] args) {
    int result = 0;
    // 問題文から1 = 1^5は含まないので2からスタート
    // iの最大値はわからないならとりあえず大きい数字入れておく?
    for (int i = 2; i <= 1000000000; i++){
      if (i == power(i)){
        result += i;
      }
    }
    System.out.println(result);
  }

  private static int power(int number) {
    int result = 0;
    while (number != 0){
      int temp = number % 10;
      result += (int) Math.pow(temp,5);
      number /= 10;
    }
    return result;
  }

}
