package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * "以下のような 800 文字の文字列がある。
 *
 * <p>この文字列を 1 行 20 文字の形(全部で 40 行)に書き直したとする。 ※最初の4行のみを示す。 ALPHABETLLABABBPLAAL TABALATAALAALPAEPPAH
 * ABATALABLEBLBEALBLPL BALLBLALPABBA... 上から 2 行目の左から 5 文字目は「L」であり、そこから下方向に 3 文字を読むと「LAB」となっている。
 * 書き直した後の文字列全体で見たときに、下方向に 3 文字読むと「LAB」となっている箇所は全部でいくつあるか。
 */
public class p09_未解決 {
  private static final String string =
      "ALPHABETLLABABBPLAALTABALATAALAALPAEPPAHABATALABLE"
          + "BLBEALBLPLBALLBLALPABBALEBALABELBLBHATAHLBAAEPLBAL"
          + "LLBBLBABEATLTTLBTBELBELAEHBBBLPALTPBLALBBHLBALLAHA"
          + "BEBLBABALAPLABBPPAHTBABLAALBEHABABLAAHLEABALTLBLLB"
          + "AAAAHBAHLPTBHTAEBTAABLATALLHEBETLBLALTBLABBABLBLAE"
          + "LBAABPAELAHPLBTPELBABLPBAABBBBPBBLLTLPLLBLPBTLBEBB"
          + "LTBBBLBTBEEBLAAABALLLAAAPLPAETPABAATBBLBABBBBPAEAA"
          + "ALAAHPBLLLBLATBHHBALTLLABBHLHLBPLLHBPLAHTHBALEBAAB"
          + "ABTBTATABBBALHAATAAPAHPBLALBEAEAAAALBBHBAHLPLBPELB"
          + "LHBBHLBEBHBEBALBEBLABTBETBBBBEATBTBPBAAABBBBLBLALL"
          + "AATELBTLPBTBBLPABABELLPLLLALAABLTBABBTAALELALAALAL"
          + "EAALBTLLALBTLAALLLLAAAALLBPEPLBALBAPBAATLAALLLLBLB"
          + "HTATATBALEBBPELLALBBLLLABBLABALHABBAATEALLAPBLAPAB"
          + "BLLLPAAAEAALAABLHTBLLAALHBBABPBBLHATLLAEPELAALLBBP"
          + "LLAALATBLALBAEALBTLBLATBPAAPPTLALBBLABTAAAAAALLLLA"
          + "BBALALABBLALLABEABAAAALTPBALLBPHHBBALBBTLABBAAAHAP";

  public static void main(String[] args) {
    // 20文字ずつ部分文字列substringとして切る
    // 切ったものをString配列に入れる
    // for2重ループ
    // 外側は配列の番号(行)
    //   LABを作るには3行必要だから3行ずつ取得
    // 内側は配列の要素の列
    // 3行取って列の3文字を取得
    // 3文字が"LAB"ならcountインクリメント

    // 20文字ずつの部分文字列をListに追加
    List<String> stringList = new ArrayList<>();
    for (int i = 0; i < string.length(); i += 20) {
      stringList.add(string.substring(i, i + 20));
    }

    // Listから配列に入れ替え(ループで扱いやすくする)
    String[] strings = Arrays.toString(stringList.toArray(new String[0])).split("");

    for (int i = 0; i < strings.length; i++) {
      System.out.println(strings[i]);
    }
  }
}
