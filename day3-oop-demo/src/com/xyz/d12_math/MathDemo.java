package com.xyz.d12_math;

public class MathDemo {
    public static void main(String[] args) {
        // 1.取绝对值,返回正数
        System.out.println(Math.abs(10)); // 10
        System.out.println(Math.abs(-10.3)); // 10.3

        // 2.向上取整:5
        System.out.println(Math.ceil((4.000000000001))); // 5
        System.out.println(Math.ceil((4.0))); // 4


        // 3.向下取整:5
        System.out.println(Math.floor(5.9999999)); // 5
        System.out.println(Math.ceil((4.0))); // 4


        // 4.求指数次方
        System.out.println(Math.pow(2, 10)); // 2^10

        // 5.四舍五入
        System.out.println(Math.round(4.999));
        System.out.println(Math.round(4.50001));

        System.out.println(Math.random()); // 范围:0.0-1.0 左闭右开

        // 3 - 9 之间的随机数 (0 - 6) + 3
        int data = (int) (Math.random() * 7) + 3;
        System.out.println(data);
    }
}
