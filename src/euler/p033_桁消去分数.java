package euler;

public class p033_桁消去分数 {
  public static void main(String[] args){
    System.out.println("The answer is "  + run() + ".");
  }

  private static int run(){
    int denproduct = 1;
    int nomproduct = 1;
    for (int i = 1; i < 10; i++) {
      for (int den = 1; den < i; den++) {
        for (int nom = 1; nom < den; nom++) {
          if ((nom * 10 + i) * den == nom * (i * 10 + den)) {
            denproduct *= den;
            nomproduct *= nom;
          }
        }
      }
    }
    denproduct /= gcd(nomproduct,denproduct);
    return denproduct;
  }

  private static int gcd(int a, int b){
    if (b == 0) return a;
    return gcd(b, a % b);
  }

}
