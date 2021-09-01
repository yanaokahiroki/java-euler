package euler;

import java.util.ArrayList;
import java.util.List;

/**
 * 「最長のコラッツ数列」 正の整数に以下の式で繰り返し生成する数列を定義する.
 *
 * <p>n → n/2 (n が偶数)
 *
 * <p>n → 3n + 1 (n が奇数)
 *
 * <p>13からはじめるとこの数列は以下のようになる.
 *
 * <p>13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1 13から1まで10個の項になる. この数列はどのような数字からはじめても最終的には 1
 * になると考えられているが, まだそのことは証明されていない(コラッツ問題)
 *
 * <p>さて, 100万未満の数字の中でどの数字からはじめれば最長の数列を生成するか.
 *
 * <p>注意: 数列の途中で100万以上になってもよい
 */
public class p014_最長のコラッツ数列 {
  public static void main(String[] args) {
    System.out.println(run(1000000));
  }

  private static long run(long limit){
    long longest = 0L;
    long value = 0L;

    for (long i = 13L; i < limit; i++){
      // スタート時の数字に対してsequenceを実行→返り値のsizeを代入(メソッドチェーン)
      long currentSize = sequence(i).size();
      // もしtrueなら最大長に代入
      // その時のiをvalueに代入して返却
      if (currentSize > longest){
        longest = currentSize;
        value = i;
      }
    }
    return value;
  }


  /**
   * 偶数奇数で実際に分岐させた数列のListを返す
   * run()実行時にはそのサイズを用いる
   *
   * @param value 数字
   * @return List
   */
  private static List<Long> sequence(long value){
    List<Long> list = new ArrayList<>();

    //　スタート時の値をまず追加
    list.add(value);

    // 数列は最終的に1になるからそれまでの間ループさせる
    while (value != 1){
      // valueの偶数奇数で条件分岐
      if (value % 2 == 0){
        list.add(value /= 2);
      } else {
        list.add(value = 3 * value + 1);
      }
    }
    return list;
  }
}
