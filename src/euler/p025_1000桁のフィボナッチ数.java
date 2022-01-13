package euler;

import java.math.BigInteger;

/**
 * 「1000桁のフィボナッチ数」 フィボナッチ数列は以下の漸化式で定義される:
 *
 * <p>F&sub{n}; = F&sub{n-1}; + F&sub{n-2};, ただし F&sub{1}; = 1, F&sub{2}; = 1. 最初の12項は以下である.
 *
 * <p>F&sub{1}; = 1 F&sub{2}; = 1 F&sub{3}; = 2 F&sub{4}; = 3 F&sub{5}; = 5 F&sub{6}; = 8 F&sub{7};
 * = 13 F&sub{8}; = 21 F&sub{9}; = 34 F&sub{10}; = 55 F&sub{11}; = 89 F&sub{12}; = 144 12番目の項,
 * F&sub{12};が3桁になる最初の項である.
 *
 * <p>1000桁になる最初の項の番号を答えよ.
 */
public class p025_1000桁のフィボナッチ数 {
  public static void main(String[] args){
    System.out.println("The answer is " + fibonacciSequence() +  ".");
  }

  private static final int DIGIT = 1000;

  private static String fibonacciSequence() {
    BigInteger[] bigIntegers = new BigInteger[(int) Math.pow(10,6)];
    bigIntegers[0] = BigInteger.ONE;
    bigIntegers[1] = BigInteger.ONE;
    String answer = null;
    for (int index = 2; index < (int) Math.pow(10,6); index++){
      // フィボナッチ数列式
      bigIntegers[index] = bigIntegers[index - 1].add(bigIntegers[index - 2]);
      // 桁数判定
      if (bigIntegers[index].toString().length() == DIGIT){
        break;
      }
      answer = String.valueOf(index + 2);
    }
    return answer;
  }

}
