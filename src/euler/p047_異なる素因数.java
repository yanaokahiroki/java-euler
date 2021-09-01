package euler;

/**
 * 「異なる素因数」 それぞれ2つの異なる素因数を持つ連続する2つの数が最初に現れるのは:
 *
 * <p>14 = 2 × 7 15 = 3 × 5
 *
 * <p>それぞれ3つの異なる素因数を持つ連続する3つの数が最初に現れるのは:
 *
 * <p>644 = 2&sup{2}; × 7 × 23 645 = 3 × 5 × 43 646 = 2 × 17 × 19
 *
 * <p>最初に現れるそれぞれ4つの異なる素因数を持つ連続する4つの数を求めよ. その最初の数はいくつか?
 */
public class p047_異なる素因数 {
  public static void main(String[] args) {
    System.out.println(run());
  }

  public static int run() {
    for (int i = 2; ; i++) {
      if (       has4PrimeFactors(i + 0)
              && has4PrimeFactors(i + 1)
              && has4PrimeFactors(i + 2)
              && has4PrimeFactors(i + 3))
        return i;
    }
  }

  private static boolean has4PrimeFactors(int n) {
    return countDistinctPrimeFactors(n) == 4;
  }

  private static int countDistinctPrimeFactors(int n) {
    int count = 0;
    for (int i = 2, end = (int)Math.sqrt(n); i <= end; i++) {
      if (n % i == 0) {
        do n /= i;
        while (n % i == 0);
        count++;
        end = (int)Math.sqrt(n);
      }
    }
    if (n > 1)
      count++;
    return count;
  }
}
