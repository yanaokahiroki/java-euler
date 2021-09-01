package experiment;

import java.math.BigInteger;

public class p01 {
  public static void main(String[] args) {
    System.out.println(run());
  }

  private static String run(){
    BigInteger a, b;
    a = new BigInteger("7");
    b = a.pow(777);
    String str = "Result is " + a + "^" +777+ " = " +b;
    System.out.println(b.toString().length());
    System.out.println(b.toString().substring(324,333));
    return str;
  }
}
