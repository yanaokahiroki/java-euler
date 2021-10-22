package test;

import experiment.MyLibrary;

public class p10 {
  public static void main(String[] args) {
    int count = 1;
    int result = 0;
    for (int i = 2; count <= 10001; i++){
      if (MyLibrary.isPrime(i) && MyLibrary.isPrime((2 * i) + 1)){
        result = i;
        count++;
      }
    }
    System.out.println(result);
  }

}
