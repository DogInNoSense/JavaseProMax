package com.xyz.d6_regex;

public class RegxDemo4 {
    public static void main(String[] args) {
        // 按照政策表达式分割字符串,返回一个字符串数组
        String name = "小王werwed小刘wqeq小狗";
        String arrs[] = name.split("\\w+"); //加号代表至少出现一位以上
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        String name2 = name.replaceAll("\\w+", "  ");
        System.out.println(name2);
    }
}
