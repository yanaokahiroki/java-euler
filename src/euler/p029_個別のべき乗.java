package euler;

import java.math.BigInteger;
import java.util.*;

public class p029_個別のべき乗 {
  public static void main(String[] args) {
    System.out.println("The answer is " +calcNumberOfTerms(LIMIT) +  ".");
  }
  private static final int LIMIT = 100;

  private static int calcNumberOfTerms(int limit){
    Set<BigInteger> bigIntegerSet = new HashSet<>();
    // a^bを計算
    for (int a = 2; a <= limit; a++){
      for (int b = 2; b <= limit; b++){
        // setに追加
        // setでは値の重複は無視される(重複したからと言ってエラーにならず、追加されずにスルーされ次の処理に進む)
        bigIntegerSet.add(BigInteger.valueOf(a).pow(b));
      }
    }
    return bigIntegerSet.size();
  }
}
