package test;

/**
 * 平方根の和
 * 1 以上 5 以下の自然数の平方根の総和は √1+ √2+ √3+ √4+ √5=8.38233⋯ である。
 * 1 以上 𝑁 以下の自然数の平方根の総和が10000を超えるような最小の 𝑁 を求めよ。
 */
public class p02 {
  public static void main(String[] args) {
    double sum  = 0;
    for (int i = 1; ; i++){
      sum += Math.sqrt(i);
      if (sum > 10000){
        System.out.println(i);
        break;
      }
    }
  }
}
