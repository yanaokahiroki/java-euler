package euler;

public class p027_二次式素数 {
  public static void main(String[] args){
    System.out.println("The answer is "  + calculateATimesB() + ".");
  }

  private static int calculateATimesB(){
    int bestNumber = 0;
    int bestA = 0;
    int bestB = 0;
    for (int a = -999; a < 1000; a++){
      for (int b = -1000; b <= 1000; b++){
        int number = numberOfPrime(a,b);
        if (number > bestNumber){
          bestNumber = number;
          bestA = a;
          bestB = b;
        }
      }
    }
    return bestA * bestB;
  }

  private static int numberOfPrime(int a, int b){
    // 条件式を省略したfor文
    // for文を抜けるための条件を別で指定することで可能
    for (int numberOfPrime = 0; ; numberOfPrime++){
      // i^2+a・i+b
      int primeNumber = numberOfPrime * numberOfPrime + a * numberOfPrime  + b;
      // 正数でない、または素数でない場合にループを終了してリターン
      // 返すのはその時の素数の数
      if (primeNumber < 0 || !isPrimeNumber(primeNumber)){
        return numberOfPrime;
      }
    }
  }

  private static boolean isPrimeNumber(int number){
    if (number < 2) return false;
    int sqrt = (int) Math.sqrt(number);
    for (int index = 2; index < sqrt; index++){
      if (number % index == 0) return false;
    }
    return true;
  }
}
