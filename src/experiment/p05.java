package experiment;

import java.util.ArrayList;
import java.util.List;

public class p05 {
  public static void main(String[] args) {
    List<String> stringList = new ArrayList<>();
    for (int i = 0; i < string.length(); i+=22){
      stringList.add(string.substring(i,i+22));
    }
    String[] strings = new String[22];
    for (int i = 0; i < 22; i++){
      strings[i] = String.valueOf(stringList.get(i).charAt(i));
      System.out.print(strings[i]);
    }
  }

  private static final String string =
      "VACLHTNAXQFTROTDPASCKNZSLRKSACOSBDXIDCGFOOFLNQVHVI"
          + "YMHINMTQDNZAQBYCRRDSTPGCIOFBAHICHNTFNLRFCTEBIDBGOB"
          + "QCTPVYOOKXKCKLBSLSIBTKVGKEPZTMDGRKDSCATYHFMSAVVYEN"
          + "GITTSOHGLNCMGHZDDGEKPYYVYYMHKESHASASRFMKOSNVLQIBVT"
          + "NNONFGXGBDLOFLAKZLGRPMOLXVMFIYIKQZBGVKTBYGTAPCHXOK"
          + "MHRSHCGIVYEDPHLCIMPXPRCPRATHHHDPZVMLQEXQPQDPLCZKOE"
          + "CKOGHCSLSIISMXGNZFCMVGRACCCRKLDOTXRLHSVTGOZYPOAIXO"
          + "XMGAFDOMCXYXALTFETPVLMBNZHEMEVZDMVESCMBFLTZARKZFAZ"
          + "OHLTKXLNHZZGVFIGLOGDNFDSNBQGIAKNXSXNZMFHNFTCMPDIPS"
          + "RFPPFQHISEVIHNMTIPCGHLSIKHSTZKGLZS";
}
