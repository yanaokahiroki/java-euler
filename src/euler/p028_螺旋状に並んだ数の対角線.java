package euler;

public class p028_螺旋状に並んだ数の対角線 {
  public static void main(String[] args){
    System.out.println("The answer is "  + calcSumOfDiagonals(LIMIT) + ".");
  }

  public static final int LIMIT = 1001;

  private static long calcSumOfDiagonals(int limit){
    // 中心の1で初期化しておく
    long sumOfDiagonals = 1;
    for (int number = 3; number <= limit; number+=2){
      sumOfDiagonals += 4 * number * number - 6 * (number -1);
    }
    return sumOfDiagonals;
  }

}
