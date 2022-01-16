package euler;

import java.util.Arrays;

public class p041_パンデジタル素数 {
  public static void main(String[] args) {
    System.out.println(run());
  }

  private static int run() {
    int max = 0;
    for (int i = 12; i < 987654321; i++) {
      if (isPanDigital(String.valueOf(i)) && isPrime(i)) {
        max = i;
        System.out.println("現在の最大値：" + max);
      }
    }
    return max;
  }

  private static boolean isPanDigital(String sequence) {
    System.out.println("isPanDigital："+ sequence);
    if (sequence.length() != 9) return false;
    char[] charArray = sequence.toCharArray();
    Arrays.sort(charArray);
    return new String(charArray).equals("123456789");
  }

  private static boolean isPrime(int number) {
    if (number == 2) return true;
    if (number == 0 || number == 1) return false;
    if (number % 2 == 0) return false;
    int sqrt = (int) Math.sqrt(number);
    for (int index = 3; index <= sqrt; index += 2) {
      if (number % index == 0) return false;
    }
    return true;
  }
}
