package test;

/**
 * 余り・余り・余り
 * 自然数 𝑁 は以下の条件を満たす。
 * • 𝑁を2で割ると余りが1になる。
 * • 𝑁を3で割ると余りが2になる。
 * • 𝑁を4で割ると余りが3になる。
 * • 以降同様に、𝑘 =2,3,...,16 について𝑁 を 𝑘 で割ると余りが 𝑘 − 1 になる。
 * • しかし、𝑁 を 17 で割ると余りが 15 になる。
 * この条件を満たす最小の 𝑁 を求めよ。
 */
public class p07_未解決 {
  public static void main(String[] args) {
    LABEL:{
      for (int i = 20; ; i++) {
        for (int j = 2; j <= 16; j++){
          System.out.println(i % j == j - 1);
          if ((i % j) == (j - 1) && i % 17 == 15){
            System.out.println(i);
            break LABEL;
          }
        }
      }
    }
  }
}
