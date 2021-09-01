package euler;

/**
 * 「特別なピタゴラス数」
 * ピタゴラス数(ピタゴラスの定理を満たす自然数)とは a < b < c で以下の式を満たす数の組である.
 *
 * <p>a2 + b2 = c2 例えば, 32 + 42 = 9 + 16 = 25 = 52 である.
 *
 * <p>a + b + c = 1000 となるピタゴラスの三つ組が一つだけ存在する. これらの積 abc を計算しなさい.
 */
public class p009_特別なピタゴラス数 {
  public static void main(String[] args){
    System.out.println(run());
  }

  public static int run(){
    int n = 1000;
    int result = 0;
    for (int a = 1; a < (n / 3); a++){
      for (int b = 1; b < (1000-a)/2; b++){
        int c = 1000 - a -b;
        // もしピタゴラスの定理が成り立つa,b,cの組み合わせならresultに入れてループを抜ける
        if (c*c == a*a + b*b){
          System.out.println("a=" + a + " b=" + b + " c=" + c + " abc=" + a*b*c);
          result = a*b*c;
          break;
        }
      }
    }
    return result;
  }
}
