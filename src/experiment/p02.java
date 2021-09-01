package experiment;

import java.util.ArrayList;
import java.util.List;

public class p02 {
  public static void main(String[] args) {
    long max = 0;
    long value = 0;
    long current;
    for (long i = 13L; i < 1000000L; i++){
      current = calcCollatz(i).size();
      if (current > max){
        max = current;
        value = i;
      }
    }
    System.out.println(value);
  }

  private static List<Long> calcCollatz(long number) {
    List<Long> longList = new ArrayList<>();
    longList.add(number);
    while(number != 1){
      if (number % 2 == 0){
        longList.add(number /= 2);
      } else {
        longList.add(number = 3 * number + 1);
      }
    }
    return longList;
  }
}
