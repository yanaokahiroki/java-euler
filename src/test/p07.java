package test;

/**
 * 余り・余り・余り 自然数 𝑁 は以下の条件を満たす。 • 𝑁を2で割ると余りが1になる。 • 𝑁を3で割ると余りが2になる。 • 𝑁を4で割ると余りが3になる。 • 以降同様に、𝑘
 * =2,3,...,16 について𝑁 を 𝑘 で割ると余りが 𝑘 − 1 になる。 • しかし、𝑁 を 17 で割ると余りが 15 になる。 この条件を満たす最小の 𝑁 を求めよ。
 */
public class p07 {
  public static void main(String[] args) {
    for (int i = 20; ; i++) {
      if (isChecked(i)) {
        // 初めてTrueになった段階でループを抜けることで最小のNを取得する
        System.out.println(i);
        break;
      }
    }
  }

  private static boolean isChecked(int number) {
    for (int k = 2; k <= 16; k++) {
      if (number % k != k - 1 || number % 17 != 15) {
        return false;
      }
    }
    return true;
  }
}
