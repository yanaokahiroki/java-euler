package test;

import java.math.BigInteger;

/**
 * 926の9260乗を求めその数字列内に"926"が登場する回数を求めよ。
 */
public class p01 {
  public static void main(String[] args) {
    String expNumber = BigInteger.valueOf(926).pow(9260).toString();
    int count = 0;
    for (int i = 0; i < expNumber.length(); i++){
      // String#startWithは文字列が第一引数で指定するprefixで始まるかどうか判定
      // 第二引数のoffsetで文字列の開始位置を指定できる
      // 今回は開始位置を動かすことで文字列中を探索できるようにしている
      if (expNumber.startsWith("926", i)){
        count++;
      }
    }
    System.out.println(count);
  }
}
