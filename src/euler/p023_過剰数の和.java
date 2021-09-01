package euler;

public class p023_過剰数の和 {
  public static void main(String[] args){
    System.out.println("The answer is " + sumOfNumbers() + ".");
  }

  private static final int LIMIT = 28123;

  private static final boolean[] isAbundant = new boolean[LIMIT + 1];


  /**
   * 2つの過剰数の和で表すことができない正の整数のみを和に加えてその総和を返す
   *
   * @return 2つの過剰数の和で表すことができない正の整数の総和
   */
  public static int sumOfNumbers(){
    for (int i = 0; i < isAbundant.length; i++){
      isAbundant[i] = isAbundantNumber(i);
    }
    int sum = 0;
    for (int index = 1; index <= LIMIT; index++){
      if (!isSumOfAbundantNumbers(index)){
        sum += index;
      }
    }
    return sum;
  }

  /**
   * 過剰数であるかどうかを判定
   *
   * @param number 整数
   * @return 過剰数であればtrue
   */
  private static boolean isAbundantNumber(int number){
    if (number < 0) throw new IllegalArgumentException("numberが負数です。");

    int sumOfDivisors = 1;
    int sqrt = (int) Math.sqrt(number);
    for (int index = 2; index <= sqrt; index++ ){
      if (index % number == 0){
        sumOfDivisors += index;
      }
    }
    return sumOfDivisors > number;
  }

  /**
   * 2つの過剰数の和で表せるかどうかを判定
   * この場合falseのデータがほしい
   *
   * @param number 整数
   * @return 2つの過剰数の和で表すことができるならtrueできないならfalse
   */
  private static boolean isSumOfAbundantNumbers(int number){
    for (int index = 0; index <= number; index++){
      if (isAbundant[index] && isAbundant[number - index]){
        return true;
      }
    }
    return false;
  }




}
