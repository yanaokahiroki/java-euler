package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 「2039 年 7 月 15 日」という日付は、そこに現れる数字(2, 0, 3, 9, 7, 1, 5)がすべて異なっている。 21 世紀(2001 年~2100
 * 年)の間に、このような「数字が全て異なっている」ような日は何回現れるか。
 *
 * <p>2580日
 */
public class p08 {
  public static void main(String[] args) {
    // LocalDate型開始日、終了日
    LocalDate localStartDate = LocalDate.of(2001, 1, 1);
    LocalDate localEndDate = LocalDate.of(2100, 12, 31);

    // フォーマット
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMd");

    // 数字が全て異なる場合にインクリメントする変数
    int count = 0;

    // ------------------------ Listのみで算出する場合 -------------------------------
    // for文のindexにLocalDate型で変数を定義
    for (LocalDate start = localStartDate;
        start.isBefore(localEndDate.plusDays(1));
        start = start.plusDays(1)) {
      // 上で定義したformatterでLocalDateをフォーマット->1文字ずつバラす->配列へ
      String[] strings = start.format(formatter).split("");

      // 配列からListに変換
      List<String> stringList = new ArrayList<>(List.of(strings));

      // Stream.distinct()でListの重複を削除->count()でstreamのサイズを確認
      // それが元のListのサイズと同じなら重複していないのでcount++
      if (stringList.size() == stringList.stream().distinct().count()) {
        count++;
      }
    }

    // ---------------------- ListとSetで算出する場合 --------------------------------
    for (LocalDate start = localStartDate;
        start.isBefore(localEndDate.plusDays(1));
        start = start.plusDays(1)) {
      String[] strings = start.format(formatter).split("");
      List<String> stringList = new ArrayList<>(List.of(strings));

      // Listを基にHashSetを定義
      // HashSetは重複を許可しないので重複した場合にはサイズが変わる
      Set<String> stringSet = new HashSet<>(stringList);

      // HashSetのサイズが元のサイズと一致していれば重複していないのでcount++
      if (stringList.size() == stringSet.size()) {
        count++;
      }
    }

    System.out.println(count);
  }
}
