package com.xyz.d4_constant;

public class ConstantDemo1 {
    // 常量
    public static final String SCHOOL_NAME = "传智教育";
    public static final String USER_NAME = "xyz";

    public static void main(String[] args) {
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        if (USER_NAME.equals("xyz")) {
            System.out.println("login");
        }
    }
}
