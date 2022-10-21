package com.xyz.d6_regex;

public class RegxDemo1 {
    public static void main(String[] args) {
        // 校验qq号,必须全部数字6-20位
        System.out.println(checkQQ("1623221266"));
        System.out.println(checkQQ("162322126x"));
        System.out.println(checkQQ("2344"));

        System.out.println("-------------------");

        // 正则表达式
        System.out.println(checkQQ2("1623221266"));
        System.out.println(checkQQ2("162322126x"));
        System.out.println(checkQQ2("2344"));
    }

    public static boolean checkQQ2(String qq) {
        return qq != null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq) {
        // 1.判断qq号码的长度是否满足要求
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        // 2.判断qq号是否全部是数字,不是返回false
        for (int i = 0; i < qq.length(); i++) {
            // 获得每位字符
            char ch = qq.charAt(i);
            // 判断字符是否是数字
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
