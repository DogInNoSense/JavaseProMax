package com.xyz.d6_regex;

public class RegxDemo2 {
    public static void main(String[] args) {
        // 只能出现a b c
        System.out.println("a".matches("[abc]")); // true
        System.out.println("z".matches("[abc]"));// false

        // 不能出现a b c
        System.out.println("a".matches("[^abc]"));// false
        System.out.println("z".matches("[^abc]"));// true

        System.out.println("a".matches("\\d")); // false 数字
        System.out.println("3".matches("\\d")); // true
        System.out.println("333".matches("\\d")); // false 默认只能匹配一个字符

        System.out.println("z".matches("\\w")); // true 英文 字母 数字 下划线
        System.out.println("2".matches("\\w")); // true
        System.out.println("21".matches("\\w")); // false 只能匹配一个字符
        System.out.println("你".matches("\\w")); // false
        System.out.println("-------------------------");
        // 校验密码
        // 必须是字母数字下划线 至少6位

        System.out.println("2442fsfsf".matches("\\w{6,}"));
        System.out.println("2442f".matches("\\w{6,}"));

        // 验证码 必须是数字和字符 必须是4位
        System.out.println("-------------------------");
        System.out.println("23df".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23_f".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23df".matches("[]\\w&&[^_]]{4}"));


    }
}
