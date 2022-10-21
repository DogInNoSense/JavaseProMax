package com.xyz.d6_regex;

import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        // 校验手机号码 邮箱 电话号码

//        checkPhone();
//        checkEmail();
        checkPhoneNum();
    }
    // 3.检测电话号码
    public static void checkPhoneNum() {
        Scanner sc = new Scanner(System.in);
        // 判断手机号码的格式是否正确
        while (true) {
            System.out.println("请输入您的电话号码:");
            String phone = sc.next();
            if (phone.matches("0\\d{2,6}-?\\d{5,20}")) {
                System.out.println("匹配正确,注册完成!");
                break;
            } else {
                System.out.println("格式有误!");
            }
        }
    }

    // 2.检测邮箱
    public static void checkEmail() {
        Scanner sc1 = new Scanner(System.in);
        // 判断手机号码的格式是否正确
        while (true) {
            System.out.println("请输入您的注册邮箱:");
            String email = sc1.next();
//            email.matches("\\w{1,30}@[a-zA-z0-9]{2,30}(\\.[a-zA-z0-9]{2,30}){1,2}]")
            if (email.matches("\\w{1,30}@[a-zA-z0-9]{2,10}(\\.[a-zA-z0-9]{2,20}){1,2}")) {
                System.out.println("匹配正确,注册完成!");
                break;
            } else {
                System.out.println("格式有误!");
            }
        }

    }

    // 1.检测手机号
    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        // 判断手机号码的格式是否正确
        while (true) {
            System.out.println("请输入您的注册号码:");
            String phone = sc.next();
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("匹配正确,注册完成!");
                break;
            } else {
                System.out.println("格式有误!");
            }
        }
    }
}
