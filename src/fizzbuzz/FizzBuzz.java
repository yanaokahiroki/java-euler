package fizzbuzz;

import java.util.Scanner;

import static java.lang.System.*;

public final class FizzBuzz {
  /** Fizzになる値 */
  private static final int FIZZ_NUMBER = 3;
  /** Buzzになる値 */
  private static final int BUZZ_NUMBER = 5;
  /** FizzBuzzになる値 */
  private static final int FIZZBUZZ_NUMBER = 15;

  public static void main(String[] args){
    fizzBuzzLoop();
    fizzBuzzPick();
  }


  /**
   * 標準入力で取得した1以上の整数までFizzBuzzを続ける
   */
  public static void fizzBuzzLoop(){
    out.print("数字を入力してください：");
    int number = new Scanner(in).nextInt();

    // 処理開始時間
    long processingStartTime = currentTimeMillis();

    if (number <= 0) throw new IllegalArgumentException("1以上の整数で入力してください");
    int fizzBuzzSum = 0;
    for (int index = 1; index <= number; index++) {
      if (index % FIZZBUZZ_NUMBER == 0) {
        fizzBuzzSum += index;
        out.println(index + ":FizzBuzz");
      }
      if (index % FIZZ_NUMBER == 0) out.println(index + ":Fizz");
      if (index % BUZZ_NUMBER == 0) out.println(index + ":Buzz");
      if (index % FIZZ_NUMBER != 0 && index % BUZZ_NUMBER != 0) out.println(index);
    }

    // 処理終了時間
    long processingEndTime = currentTimeMillis();

    out.println("fizzbuzzの総和：" + fizzBuzzSum);
    out.println("処理時間:" + (processingEndTime - processingStartTime) + "ms");
  }

  /**
   * 標準入力で取得した1以上の整数でFizzBuzzを実行
   */
  public static void fizzBuzzPick(){
    out.print("数字を入力してください：");
    int number = new Scanner(in).nextInt();

    // 処理開始時間
    long processingStartTime = currentTimeMillis();
    if (number <= 0) throw new IllegalArgumentException("1以上の整数で入力してください");
    if (number % FIZZ_NUMBER == 0) out.println(number + ":Fizz");
    if (number % BUZZ_NUMBER == 0) out.println(number + ":Buzz");
    if (number % FIZZBUZZ_NUMBER == 0) out.println(number + ":FizzBuzz");
    if (number % FIZZ_NUMBER != 0 && number % BUZZ_NUMBER != 0) out.println(number);
    

    // 処理終了時間
    long processingEndTime = currentTimeMillis();

    out.println("処理時間:" + (processingEndTime - processingStartTime) + "ms");
  }

}
