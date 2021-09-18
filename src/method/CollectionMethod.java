package method;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

/**
 * CollectionMethod
 *
 * @author yanaokahiroki
 */
public class CollectionMethod {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("TOKYO", "OSAKA", "NAGOYA", "FUKUOKA");
    stringList.stream()
        .filter(s -> s.contains("Y"))
        .map(s -> s.toLowerCase(Locale.ROOT))
        .forEach(out::println);

    out.println(
        Stream.of("TOKYO", "OSAKA", "NAGOYA", "FUKUOKA")
            .sorted()
            .collect(Collectors.joining("\uD83C\uDF34")));

    String string = "bnieaboreiaglaneivneabBIUAFGUEQBOVNAAAAA";
    List.of(string).stream()
        .map(
            s -> {
              s = s.replaceAll("[aiueoAIUEO]", "");
              return s;
            })
        .forEach(out::println);

    out.println(List.of(string).getClass().getSimpleName());

    //    out.println(calculateSquare(4));
    //    out.println(calculateAverage(4,4));
    //    out.println(selectLargerNumber(1,10));
    //    drawTriangle(10);
    //    drawTriangle(5,'&');
    //    drawTimesTable();
    //    checkPlaceHolder();
    //    getLocalTime();
    //    getNumberArray();
    //    practiceArrayList();
    //    practiceLinkedList();
    //    practiceHashSet();
    //    practiceTreeSet();
    //    practiceHashMap();
    //    applyCollections();
    //    practiceException();
  }

  /**
   * 整数の2乗計算
   *
   * @param number 2乗する整数
   * @return numberの2乗
   */
  public static int calculateSquare(int number) {
    return number * number;
  }

  public static int calculateAverage(int number1, int number2) {
    return (number1 + number2) / 2;
  }

  public static int selectLargerNumber(int number1, int number2) {
    return Math.max(number1, number2);
  }

  public static void drawTriangle(int triangleSize) {
    for (int i = 0; i < triangleSize; i++) {
      for (int j = 0; j <= i; j++) {
        out.print("$");
      }
      out.println();
    }
  }

  public static void drawTriangle(int triangleSize, char letter) {
    for (int i = 0; i < triangleSize; i++) {
      for (int j = 0; j <= i; j++) {
        out.print(letter);
      }
      out.println();
    }
  }

  /** 九九表 */
  public static void drawTimesTable() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        out.print(i * j + " ");
      }
      out.println();
    }
  }

  public static void checkPlaceHolder() {
    // 表示フォーマット
    final String FORMAT = "%-9s %-13s 所持金%,6d";
    String s = String.format(FORMAT, "hiroki", "engineer", 10000);
    out.println(s);
  }

  /** ローカルタイムを取得 */
  public static void getLocalTime() {
    LocalDateTime localDateTime1 = LocalDateTime.now();
    LocalDateTime localDateTime2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
    out.println(localDateTime1 + " " + localDateTime2);
    ZonedDateTime zonedDateTime = localDateTime2.atZone(ZoneId.of("Europe/London"));
    LocalDateTime localDateTime3 = zonedDateTime.toLocalDateTime();
    out.println(localDateTime1 + " " + localDateTime2 + " " + localDateTime3);
  }

  public static void getNumberArray() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int index = 0; index < 100; index++) {
      stringBuilder.append(index + 1).append(",");
    }
    String strings = stringBuilder.toString().replace(",", "/");
    String[] stringArray = strings.split("/");
    out.println(strings);
    out.println(stringArray.length);
  }

  public static void practiceArrayList() {
    // 右辺のダイヤモンド演算子内は省略できる勝手に推測してくれるから
    // 左辺はあいまいな型にすべき
    List<Integer> arrayList = new ArrayList<>();
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(30);
    for (int number : arrayList) {
      out.println(number); // 10 20 30
    }
    // setメソッドの返り値は上書き前に入ってた要素
    out.println(arrayList.set(1, 200)); // 20
    out.println(arrayList.get(1)); // 200
    out.println(arrayList.size()); // 3
    for (int i : arrayList) {
      out.println(i);
    }
    // arrayList.clear();
    if (arrayList.isEmpty()) out.println("空です");
    arrayList.remove(1);
    out.println(arrayList.size()); // 2
  }

  public static void practiceLinkedList() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(10);
    out.println(linkedList.get(0));
  }

  public static void practiceHashSet() {
    // Setは重複NG
    // 順序関係がない
    // => setやgetがない
    Set<String> stringSet = new HashSet<>();
    stringSet.add("赤");
    stringSet.add("黄");
    stringSet.add("緑");
    //    stringSet.add("緑"); // 無視される
    out.println(stringSet.size());
    for (String value : stringSet) {
      // 順序関係がないから実行毎に順番が違うかも
      out.println(value);
    }
  }

  public static void practiceTreeSet() {
    // TreeSetは辞書順になる
    Set<String> stringSet = new TreeSet<>();
    stringSet.add("お");
    stringSet.add("あ");
    stringSet.add("う");
    for (String s : stringSet) {
      out.println(s);
    }
  }

  public static void practiceHashMap() {
    Map<String, Integer> prefs = new HashMap<>();
    prefs.put("京都府", 255);
    prefs.put("東京都", 1261);
    prefs.put("熊本県", 181);
    int tokyo = prefs.get("東京都");
    out.println(tokyo);
    prefs.remove("京都府");
    prefs.put("熊本県", 182);
    int kumamoto = prefs.get("熊本県");
    out.println(kumamoto);
    // valueも取り出す
    prefs
        .keySet()
        .forEach(
            key -> {
              int value = prefs.get(key);
              out.println(key + "/" + value);
            });
  }

  public static void applyCollections() {
    Map<String, List<String>> ranking = new HashMap<>();
    ranking.put("東京都", new ArrayList<>());
    ranking.get("東京都").add("寿司");
    ranking.get("東京都").add("のり");
    ranking.get("東京都").add("丼");
    ranking.get("東京都").add("海鮮");
    ranking
        .keySet()
        .forEach(
            key -> {
              List<String> valueList = ranking.get("東京都");
              valueList.forEach(out::println);
            });
    out.println(ranking.get("東京都"));
  }

  public static void practiceException() throws IOException {
    FileWriter fileWriter = new FileWriter("data.txt");
    fileWriter.write("HELLO");
  }
}
