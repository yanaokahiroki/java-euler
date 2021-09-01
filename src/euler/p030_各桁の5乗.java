package euler;

/**
 * 「各桁の5乗」 驚くべきことに, 各桁を4乗した数の和が元の数と一致する数は3つしかない.
 *
 * <p>1634 = 14 + 64 + 34 + 44 8208 = 84 + 24 + 04 + 84 9474 = 94 + 44 + 74 + 44 ただし,
 * 1=14は含まないものとする. この数たちの和は 1634 + 8208 + 9474 = 19316 である.
 *
 * <p>各桁を5乗した数の和が元の数と一致するような数の総和を求めよ.
 */
public class p030_各桁の5乗 {
  public static void main(String[] args) {
    System.out.println("The answer is " + calcSumOfPowersOfDigits() + ".");
  }

  private static int calcSumOfPowersOfDigits(){
    int sum = 0;
    // 100万までで収まる
    for (int index = 2; index < 1000000; index++) {
      // もし元の数と各桁の5乗和が一致していたらsumに追加
      if (index == sumOfFifthPowersOfDigits(index)) {
        sum += index;
      }
    }
    return sum;
  }

  private static int sumOfFifthPowersOfDigits(int number){
    int sumOfFifthPowersOfDigits = 0;
    // numberはint型のため0.1になる時点で0となる
    while (number != 0){
      // ある数値を10で割った余りはその数値の下1桁になる
      int y = number % 10;
      sumOfFifthPowersOfDigits += (int) Math.pow(y,5);
      number /= 10;
    }
    return sumOfFifthPowersOfDigits;
  }
}
