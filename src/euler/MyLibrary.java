package euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Project Eulerでよく使用するアルゴリズムをメソッド化しておく。
 *
 * @author yanaokahiroki
 */
public final class MyLibrary {

  /** コンストラクタをprivateにしてインスタンス化させない */
  private MyLibrary() {
    throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
  }

  /**
   * int型整数が素数であるか判定
   *
   * @param number 整数
   * @return 素数であればtrue
   */
  public static boolean isPrime(int number) {
    if (number == 2) return true;
    if (number == 0 || number == 1) return false;
    if (number % 2 == 0) return false;
    int sqrt = (int) Math.sqrt(number);
    for (int index = 3; index <= sqrt; index += 2) {
      if (number % index == 0) return false;
    }
    return true;
  }

  /**
   * BigInteger版素数判定
   *
   * @param number 正の整数
   * @return 素数ならtrue
   */
  public static boolean isPrime(BigInteger number) {
    BigInteger two = new BigInteger("2");
    if (number.equals(two)) return true;
    if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) return false;
    if (number.remainder(two).equals(BigInteger.ZERO)) return false;
    BigInteger sqrt = number.sqrt();
    for (long i = 3; i <= sqrt.longValue(); i += 2) {
      if (number.remainder(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
        return false;
      }
    }
    return true;
  }

  /**
   * 上限numberまでの素数リスト
   *
   * @param number 上限
   * @return int型素数リスト
   */
  public static List<Integer> getPrimeList(int number) {
    List<Integer> primeList = new ArrayList<>();
    for (int i = 2; i <= number; i++) {
      if (isPrime(i)) {
        primeList.add(i);
      }
    }
    return primeList;
  }

  /**
   * 素因数リスト 整数numberの素因数を求めてリストに追加
   *
   * <p>素因数：対象の数を割り切れる(因数)　かつ　その因数が素数
   *
   * @param number 整数
   * @return int型素数List
   */
  public static List<Integer> getPrimeFactorList(long number) {
    List<Integer> factorList = new ArrayList<>();
    long sqrt = (long) Math.sqrt(number);
    for (int i = 2; i <= sqrt; i++) {
      if (number % i == 0 && isPrime(i)) {
        factorList.add(i);
      }
    }
    return factorList;
  }

  /**
   * long型整数の桁数を取得する 数値を文字列に変換して桁数を取得できる
   *
   * @param number 整数
   * @return 桁数
   */
  public static int getDigits(long number) {
    return String.valueOf(number).length();
  }

  /**
   * 最大maxまでのフィボナッチ数列
   *
   * @return フィボナッチ数列リスト
   */
  public static List<BigInteger> fibonacciSequence(int max) {
    BigInteger[] bigIntegers = new BigInteger[(int) Math.pow(10, 6)];
    bigIntegers[0] = BigInteger.ONE;
    bigIntegers[1] = BigInteger.ONE;
    List<BigInteger> bigIntegerList = new ArrayList<>();
    for (int index = 2; index <= max; index++) {
      // フィボナッチ数列式
      bigIntegers[index] = bigIntegers[index - 1].add(bigIntegers[index - 2]);
      bigIntegerList.add(bigIntegers[index]);
    }
    return bigIntegerList;
  }

  /**
   * 2つの整数a, bの最大公約数(Greatest Common Divisor, G.C.D) a, bを割り切ることができる最大の数(約数)
   *
   * @param a 整数
   * @param b 整数
   * @return 最大公約数
   */
  public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  /**
   * BigInteger版最大公約数
   *
   * @param x BigInteger
   * @param y BigInteger
   * @return BigIntegerの最大公約数
   */
  public static BigInteger createGcd(BigInteger x, BigInteger y) {
    return (Objects.nonNull(x) ? x : BigInteger.ONE).gcd(y);
  }

  /**
   * 2つの整数a, bの最小公倍数(Least Common Multiple, L.C.M) a, bで共通の倍数の内最も小さい数
   *
   * <p>以下の関係式よりLCMについて解く 最大公約数G.C.Mと最小公倍数L.C.Mの関係 GCM(a, b) * LCM(a, b) = a * b
   *
   * @param a 整数
   * @param b 整数
   * @return 最小公倍数
   */
  public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

  /**
   * BigInteger版最小公倍数
   *
   * @param x BigInteger
   * @param y BigInteger
   * @return BigIntegerの最小公倍数
   */
  public static BigInteger createLcm(BigInteger x, BigInteger y) {
    return x.multiply(y)
        .divide(Objects.nonNull(createGcd(x, y)) ? createGcd(x, y) : BigInteger.ONE);
  }

  /**
   * 引数nの階乗を計算する(BigInteger版)
   *
   * @param n 非負整数
   * @return nの階乗
   */
  public static BigInteger getFactorial(int n) {
    BigInteger bigInteger = BigInteger.ONE;
    for (int i = 1; i <= n; i++) {
      bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
    }
    return bigInteger;
  }

  /**
   * 引数nの階乗を計算する(int版)
   *
   * @param number 非負整数
   * @return numberの階乗
   */
  public static int getIntFactorial(int number) {
    int factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }
    return factorial;
  }

  /**
   * 整数numberの約数の和を計算する
   *
   * @param number 整数
   * @return 整数numberの約数の和
   */
  public static int getDivisorsSum(int number) {
    // 約数の和
    int sum = 0;
    for (int i = 1; i <= number / 2; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  /**
   * 整数numberの約数の個数を返す
   *
   * @param number 整数
   * @return 約数の個数(約数Listのsize)
   */
  public static int getDivisorCount(int number) {
    List<Integer> integerList = new ArrayList<>();
    for (int i = 1; i <= number / 2; i++) {
      if (number % i == 0) {
        integerList.add(i);
      }
    }
    return integerList.size();
  }

  /**
   * 整数numberの約数のListを返す
   *
   * @param number 整数
   * @return 約数List
   */
  public static List<Integer> getDivisorList(int number) {
    List<Integer> integerList = new ArrayList<>();
    for (int i = 1; i <= number / 2; i++) {
      if (number % i == 0) {
        integerList.add(i);
      }
    }
    return integerList;
  }
}
