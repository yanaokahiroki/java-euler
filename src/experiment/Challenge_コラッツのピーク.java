package experiment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 正整数について「奇数ならば 3 倍して 1 を足し、偶数ならば 2 で割る」という操作を考える。例えば • 5は奇数なので5→16 • 6は偶数なので6→3 となる。さらに、正整数 𝑛
 * について、「𝑛 から始めてこの操作を結果が 1 になるまで反復したときに、途中で 出現する最大の整数」のことを「𝑛 に対するピーク」と呼ぶことにする。 例えば、6
 * に対して操作を反復すると以下のようになるので、「6 に対するピーク」は 16 となる。
 *
 * <p>• 6→3→10→5→16→8→4→2→1
 *
 * <p>1 以上 1000000 以下の整数 𝑛 の中で「𝑛 に対するピーク」が最大となる 𝑛 を求めよ。 ※「全ての正整数について、操作を反復すると必ず 1
 * に到達する」と予想されているが、この予想が成立するか否かは現在のところ未解決である。ただし、20 桁以内の整数については成立することがわかっている。
 */
public class Challenge_コラッツのピーク {
  public static void main(String[] args) {
    long peak = 0;
    int result = 0;
    for (int i = 1; i <= 1000000; i++) {
      long currentPeak = Collections.max(sequence(i));
      if (currentPeak > peak){
        peak = currentPeak;
        result = i;
      }
    }
    System.out.println(result);
  }

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
