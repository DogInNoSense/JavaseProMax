package com.xyz.d2_recusion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        /*
        递归的形式
         */
        test();

    }

    public static void test() {
        System.out.println("========test被执行==============");

        test(); // 直接递归形式
    }

    public static void test2() {
        System.out.println("========test2被执行==============");

        test3(); // 直接递归形式
    }

    public static void test3() {
        System.out.println("========test被执行==============");

        test2(); // 直接递归形式
    }


}
