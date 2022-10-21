package com.xyz.d5_integer;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 11;
        Integer a2 = a;
        System.out.println(a); // 自动封装
        System.out.println(a1);
        System.out.println(a2);

        Integer it = 100;
        int it1 = it; // 自动拆箱
        System.out.println(it1);

        // 1.包装类可以把基本类型的数据转换成字符串形式
        Integer i3 = 23;
        String rs = i3.toString();
        System.out.println(rs + 1);
        // 直接加字符串得到字符串类型
        String rs2 = i3 + "";
        System.out.println(rs2 + 1);

        // 2.把字符型的数据转换成真实的数据类型
        System.out.println("-----------------");
        String number = "23";
        // 转换成整数
        int age = Integer.parseInt(number);
        System.out.println(age + 1);

        String number1 = "99.9";
        double score = Double.parseDouble(number1);
        System.out.println(score + 1);
    }
}
