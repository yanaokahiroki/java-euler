package euler;

/**
 * 「3と5の倍数」 10未満の自然数のうち, 3 もしくは 5 の倍数になっているものは 3, 5, 6, 9 の4つがあり, これらの合計は 23 になる.
 *
 * <p>同じようにして, 1000 未満の 3 か 5 の倍数になっている数字の合計を求めよ.
 */
public class p001_3と5の倍数 {
  public static void main(String[] args) {
    System.out.println("Answer：" + run());
  }

  private static int run(){
    int sum = 0;
    for (int i = 1; i < 1000; i++){
      if (i % 3 == 0 || i % 5 == 0){
        sum += i;
      }
    }
    return sum;
  }
}
