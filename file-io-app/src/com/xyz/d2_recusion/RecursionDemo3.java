package com.xyz.d2_recusion;

public class RecursionDemo3 {
    public static void main(String[] args) {
        System.out.println(f(100));
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + f(n - 1);
        }
    }
}
