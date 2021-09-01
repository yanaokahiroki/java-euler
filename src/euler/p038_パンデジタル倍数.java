package euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 「パンデジタル倍数」 192 に 1, 2, 3 を掛けてみよう.
 *
 * <p>192 × 1 = 192 192 × 2 = 384 192 × 3 = 576
 *
 * <p>積を連結することで1から9の パンデジタル数 192384576 が得られる. 192384576 を 192 と (1,2,3) の連結積と呼ぶ.
 *
 * <p>同じようにして, 9 を 1,2,3,4,5 と掛け連結することでパンデジタル数 918273645 が得られる. これは 9 と (1,2,3,4,5) との連結積である.
 *
 * <p>整数と (1,2,...,n) (n > 1) との連結積として得られる9桁のパンデジタル数の中で最大のものはいくつか?
 */
public class p038_パンデジタル倍数 {
  private static final int DIGIT = 9;

  public static void main(String[] args) {
    System.out.println();
  }

  private static List<Integer> run(){
    List<Integer> integerList = new ArrayList<>();
    for (int i = 0; i <= DIGIT; i++){
      int panDigitalNumber = 123456789;
      if (String.valueOf(panDigitalNumber).length() == DIGIT){
        integerList.add(panDigitalNumber);
      }
    }
    return integerList;
  }

  private static boolean isPanDigital(String s){
    if (s.length() != 9){
      return false;
    }
    char[] chars =s.toCharArray();
    Arrays.sort(chars);
    String tempString = new String(chars);
    return tempString.equals("123456789");
  }


}
