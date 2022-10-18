package com.xyz.d13_system;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始...");
//        System.exit(0); // JVM终止

        // 返回1970-1-1 00:00:00 走到此刻的总的毫秒值
        long time = System.currentTimeMillis();
        System.out.println(time);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            System.out.println("输出:" + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.0 + "s");

        // System.currentTimeMillis() 进行时间计算 进行性能分析

        // 做数组拷贝
      /*
      arraycopy(Object src,  int  srcPos,
      Object dest, int destPos,
      int length);
       */
        int arr1[] = {10, 20, 30, 40, 50, 60, 70};
        int arr2[] = new int[6]; // [0,0,0,0,0,0] ==> [0,0,40,50,60]
        System.arraycopy(arr1,3,arr2,2,3);
        System.out.println(Arrays.toString(arr2));


        System.out.println("程序结束...");
    }
}
