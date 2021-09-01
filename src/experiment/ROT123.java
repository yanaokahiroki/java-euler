package experiment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 英字からなる文字列について、以下のような「変換」を適用する。
 * • 1 文字目(先頭)の英字を「1 つ先の英字」(A → B、B → C、など)に置き換える。
 * • 2 文字目の英字を「2つ先の英字」(A → C、B → D、など)に置き換える。
 * • 以後同様に、𝑛 文字目の英字を「𝑛 個先の英字」に置き換える。
 * ※ Z の 1 つ先は A に戻るものとする。
 * すなわち、Z の2 つ先は B で、Z の 26 個先は Z である。
 * 例えば、「DAY」にこの「変換」を適用すると「ECB」が得られる。
 * とある文字列 𝑆について、「変換」を適用すると以下の文字列が得られた。
 *
 * <p>CZZVQPNFZGRNJGWVQHKXLSTZGLHMKQQHJSQRMXPVZVCCDDFCPV
 * KBWXZLWZGKGQQBSQLCSHZHXJDPBJKLNWSXWZWJHRTHFSBPSKXX
 * WQJJNDKHLLRRTZBTPZMFDTKLGHMBRTKXPQKNTNTQRZMVKMDBDM
 * BDMRBZHZWJKVZZKNXHKHVHJJMXNCMRQKTHKTGBJSSJDLXNKXDP
 * FLGVDXVBQLNWXXQLVNNSCBGBDDVHBCCVSNRFNDHXRTTQDHZGGB
 * NPZJQRPKVTRDNPRZSPPZQXFJMSCJFZKZSPSLDMCXCTWLMPXBDQ
 * QVWPMTXCPRBPQMWIFSSIKLPMGSRXEGEIBEPRWSGFZXSPDKBWVZ
 * CRQMXNQDXRNZPRSVWDSNTPBLRTWGZNWXJNRDNPSKRTQQPDDLCJ
 * HTGQVDJFCQLMWFFSRSPPSRWJKHMCWZVMJVSDFHTZSZWXJHGQCS
 * QQGSCXRMWTVPQJZPGPGXVLLTQKTQNRSXZRBJDWRHHDKJDMNTBR
 *
 * <p>𝑆 の中には「TEAMLAB」という部分文字列が含まれる。元の文字列 𝑆 を復元した上で、𝑆 の中の「TEAMLAB」 の直後に続く 15 文字を答えよ。
 */
public class ROT123 {
  public static void main(String[] args) {
    // ①与えられた文字列を1文字ずつばらしてListに追加
    List<String> stringList = new ArrayList<>();
    stringList.addAll(Arrays.asList(string.split("")));

    // ②逆変換
    for (int i = 0; i < stringList.size(); i++) {
      // 置き換える文字(getでListのi番目の要素を取得->charAtで文字として取得)
      char from = stringList.get(i).charAt(0);

      // A ~ Z(26文字)の範囲で見るためにdeltaを定義
      // 例；27文字目に対して逆変換の場合見てるアルファベットから27つ分戻す必要がある
      // でもASCIIコード的に27つ戻すとA ~ Zの範囲外である@になってしまう
      // そこで剰余を使ってA ~ Zの範囲になるように正規化
      // i + 1の1はforループのiが0スタートであるため
      char delta = (char) ((i+ 1) % 26);


      // 逆変換
      // 元の文字fromからその文字位置に対応するdeltaを引く
      char to = (char) (from - delta);

      // 引いた結果A ~ Zの範囲外になった場合にはアルファベット文字数である26を足す
      if (to < 'A') {
        to = (char) (to + 26);
      }

      // 逆変換したものに文字を置き換える
      // set(場所, 置き換える文字)
      stringList.set(i, String.valueOf(to));
    }

    // ③逆変換したListの各要素をjoinして文字列にする
    // 第1引数のdelimiterで何で区切るか決める空文字指定で全てフラットにjoinできる
    String originalString = String.join("",stringList);

    // ④逆変換した文字列から"TEAMLAB"を探索してindexにする
    // 7を足すことでindexが"TEAMLAB"の次の文字の場所になる
    int index = originalString.indexOf("TEAMLAB") + "TEAMLAB".length();

    // ⑤indexから14文字を取得(全部で15文字)
    System.out.println(originalString.substring(index,index+15));
  }

  private static final String string =
      "CZZVQPNFZGRNJGWVQHKXLSTZGLHMKQQHJSQRMXPVZVCCDDFCPV"
          +"KBWXZLWZGKGQQBSQLCSHZHXJDPBJKLNWSXWZWJHRTHFSBPSKXX"
          +"WQJJNDKHLLRRTZBTPZMFDTKLGHMBRTKXPQKNTNTQRZMVKMDBDM"
          +"BDMRBZHZWJKVZZKNXHKHVHJJMXNCMRQKTHKTGBJSSJDLXNKXDP"
          +"FLGVDXVBQLNWXXQLVNNSCBGBDDVHBCCVSNRFNDHXRTTQDHZGGB"
          +"NPZJQRPKVTRDNPRZSPPZQXFJMSCJFZKZSPSLDMCXCTWLMPXBDQ"
          +"QVWPMTXCPRBPQMWIFSSIKLPMGSRXEGEIBEPRWSGFZXSPDKBWVZ"
          +"CRQMXNQDXRNZPRSVWDSNTPBLRTWGZNWXJNRDNPSKRTQQPDDLCJ"
          +"HTGQVDJFCQLMWFFSRSPPSRWJKHMCWZVMJVSDFHTZSZWXJHGQCS"
          +"QQGSCXRMWTVPQJZPGPGXVLLTQKTQNRSXZRBJDWRHHDKJDMNTBR";
}
