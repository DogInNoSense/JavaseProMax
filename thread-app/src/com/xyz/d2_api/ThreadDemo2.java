package com.xyz.d2_api;

public class ThreadDemo2 {
    // main方法是由主线程负责调度的
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 5; i++) {
            System.out.println("输出:" + i);
            if (i == 3) {
                // 让线程进入休眠状态
                // 休眠3s
                Thread.sleep(3000);
            }
        }
    }
}
