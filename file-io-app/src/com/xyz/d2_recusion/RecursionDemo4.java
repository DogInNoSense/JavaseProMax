package com.xyz.d2_recusion;

/*
猴子吃桃


f(x) -f(x)/2 -1 = f(x+1)
f(x)=2f(x+1)+2

条件: f(10) = 1
 */
public class RecursionDemo4 {
    public static void main(String[] args) {
        System.out.println(f(1));
    }

    public static int f(int n) {
        if (n == 10) {
            return 1;
        } else {
            return 2 + 2 * f(n + 1);
        }
    }
}
