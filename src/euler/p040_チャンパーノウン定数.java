package euler;

/**
 * 正の整数を順に連結して得られる以下の10進の無理数を考える:
 *
 * 0.123456789101112131415161718192021... 小数第12位は1である.
 *
 * d_nで小数第n位の数を表す.
 * 積d_1 * d_10 * d_100 * d_1000 * d_10000 * d_100000 * d_1000000 を求めよ.
 */
public class p040_チャンパーノウン定数 {
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 1; i < 1000000; i++) {
      stringBuilder.append(i);
    }
    int product = 1;
    for (int i = 0; i <= 6; i++) {
      product *= stringBuilder.charAt((int)Math.pow(10, i) - 1) - '0';
    }
    System.out.println(product);
  }
}
