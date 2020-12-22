package com.algorith.lk.simple;

/**
 * 简单的二进制运算
 *
 * @author lk
 * @version 1.0
 * @date 2020/12/21 22:58
 */
public class Code1 {

  private static void print(int num) {
    for (int i = 31; i >= 0; i--) {
      String result = (num & (1 << i)) == 0 ? "0" : "1";
      System.out.print(result);
    }
  }

  public static void main(String[] args) {
    print(4);
    System.out.println();
    // 取反
    print(~4);
    System.out.println();
    // 负数,除最高位外，其余取反计算后+1
    print(-5);
    System.out.println();
    // 最大为 2^31-1
    print(Integer.MAX_VALUE);
    System.out.println();
    // 最小为 -2^31
    print(Integer.MIN_VALUE);
    System.out.println();
    System.out.println("---------------------");
    /** 右移 >> 有符号右移 高位补符号位 >>> 无符号右移 高位补0 */
    int a = -1343242;
    print(a >> 2);
    System.out.println();
    print(a >>> 2);
    System.out.println("-------------------");

    int d = 5;
    int e = -d;
    System.out.println("e:" + e);
    int f = (~d + 1);
    System.out.println("f:" + f);
  }
}
