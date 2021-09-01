package euler;

/**
 * 「最小の倍数」 2520 は 1 から 10 の数字の全ての整数で割り切れる数字であり, そのような数字の中では最小の値である.
 *
 * <p>では, 1 から 20 までの整数全てで割り切れる数字の中で最小の正の数はいくらになるか.
 */
public class p005_最小の倍数 {
  public static void main(String[] args){
    System.out.println(run());
  }

  public static int run(){
    // 問題文より1~10全てで割り切れる最小の数が2520なので短縮のためそこからスタートさせる
    int number = 2520;
    // checkしてtrue(2~20全てで割り切れたら)脱出
    // falseの間ずっと回り続けるループ
    while (!checkResult(number)) {
      number++;
    }
    return number;
  }


  /**
   * resultの解答判定をする。
   * 2~20まで回して途中で割り切れない(余りがゼロにならない)ならfalse
   * 2~20の全てで割り切れループを抜けられた場合にはtrue
   *
   * @param number 数
   * @return 1~20全てで割り切れるならtrue
   */
  private static boolean checkResult(int number){
    for (int i = 2; i <= 20; i++){
      if (number % i != 0){
        return false;
      }
    }
    return true;
  }


}
