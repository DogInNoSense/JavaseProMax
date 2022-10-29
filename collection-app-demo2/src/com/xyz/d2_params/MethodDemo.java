package com.xyz.d2_params;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {
        // 1.不传参数

        sum(); // 不传参数
        sum(10); // 1个参数
        sum(10, 20, 30); // 多个参数
        sum(new int[]{10, 20, 30, 40, 50}); // 传输一个数组
    }

    // 一个形参列表中只能有一个可变参数
    public static void sum(int... nums) {
        // 在方法内部其实就是一个数组 nums
        System.out.println("元素个数:" + nums.length);
        System.out.println("元素内容:" + Arrays.toString(nums));

    }
}
