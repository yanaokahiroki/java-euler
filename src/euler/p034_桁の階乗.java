package euler;

/**
 * 「桁の階乗」
 *  145は面白い数である. 1! + 4! + 5! = 1 + 24 + 120 = 145となる.
 *
 * <p>各桁の数の階乗の和が自分自身と一致するような数の和を求めよ.
 */
public class p034_桁の階乗 {
  public static void main(String[] args) {
    System.out.println(run());
  }

  private static int run(){
    int sum = 0;
    for (int i = 3; i <= 1000000; i++){
      if (i == sumOfFactorial(i)){
        sum += i;
      }
    }
    return sum;
  }

  private static int sumOfFactorial(int number){
    int sum = 0;
    while (number != 0){
      int digit = number % 10;
      sum += calcFactorial(digit);
      number /= 10;
    }
    return sum;
  }

  public static int calcFactorial(int number){
    int factorial = 1;
    for (int i = 1; i <= number; i++){
      factorial *= i;
    }
    return factorial;
  }
}
