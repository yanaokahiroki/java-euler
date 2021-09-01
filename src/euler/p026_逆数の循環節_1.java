package euler;

/**
 * 「逆数の循環節 その1」 単位分数とは分子が1の分数である. 分母が2から10の単位分数を10進数で表記すると次のようになる.
 *
 * <p>&sup{1};/&sub{2}; = 0.5 &sup{1};/&sub{3}; = 0.(3) &sup{1};/&sub{4}; = 0.25 &sup{1};/&sub{5}; =
 * 0.2 &sup{1};/&sub{6}; = 0.1(6) &sup{1};/&sub{7}; = 0.(142857) &sup{1};/&sub{8}; = 0.125
 * &sup{1};/&sub{9}; = 0.(1) &sup{1};/&sub{10}; = 0.1
 *
 * <p>0.1(6)は 0.166666... という数字であり, 1桁の循環節を持つ. 1/7 の循環節は6桁ある.
 *
 * <p>d < 1000 なる &sup{1};/d の中で小数部の循環節が最も長くなるような d を求めよ.
 */
public class p026_逆数の循環節_1 {
  public static void main(String[] args){
    System.out.println("The answer is "  + getDenominator(LIMIT_DENOMINATOR) + ".");
  }

  private static final int LIMIT_DENOMINATOR = 1000;

  private static int getDenominator(int limit){
    double unitFraction;
    double numerator = 1.0;
    int answer = 0;

    for (int index = 2; index < limit; index++){
      unitFraction = numerator / index;
      System.out.println(unitFraction);
    }
    return answer;
  }
}
