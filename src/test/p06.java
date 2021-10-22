package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 46648 という整数は 14 で 3 回割り切ることができる。
 * • 46648 ÷ 14 = 3332 • 3332÷14=238 • 238÷14=17
 * 2281888881 を 3 回割り切ることができる最大の整数を求めよ。
 */
public class p06 {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    long number = 2281888881L;
    for (int i = 1 ;i < 100000000 ; i++){
      if (isDivideThree(number,i)){
        integerList.add(i);
      }
    }
    System.out.println(integerList);
  }

  private static boolean isDivideThree(long target,int number){
    int count = 1;
    for (int i = 1; i <= 3; i++){
      if (target % number == 0){
        count++;
      }
      target = target / number;
      if (count == 3){
        return true;
      }
    }
    return false;
  }
}
