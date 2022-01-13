package euler;

/**
 * 「偶数のフィボナッチ数」
 * フィボナッチ数列の項は前の2つの項の和である. 最初の2項を 1, 2 とすれば, 最初の10項は以下の通りである.
 *
 * <p>1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 数列の項の値が400万以下のとき, 値が偶数の項の総和を求めよ.
 */
public class p002_偶数のフィボナッチ数 {
  public static void main(String[] args) {
    System.out.println("Answer：" + run());
  }

  private static int run(){
    int sum = 0;
    // フィボナッチ数列の1番目の値
    int x = 1;
    // フィボナッチ数列の2番目の値
    int y = 2;
    while (x <= 4000000){
      if (x % 2 == 0){
        sum += x;
      }
      int z = x + y;
      x = y;
      y = z;
    }
    return sum;
  }
}
