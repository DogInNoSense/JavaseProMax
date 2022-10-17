package com.xyz.d11_api_stringbuilder;

/*
  学会使用StringBuilder操作字符串,为什么性能好
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append(1);
        sb.append(false);
        sb.append("abc");
        sb.append("b");
        sb.append("b");
        System.out.println(sb); // 输出内容不是地址
        // 支持链式编程
        StringBuilder sb1 = new StringBuilder();
        sb1.append("a").append("c").append("中国");
        System.out.println(sb1);


        // 反转
        sb1.reverse().append("18");
        System.out.println(sb1);

        // 求字符串长度
        System.out.println(sb1.length());


        // 最终的结果还是恢复成String类型 要恢复成String
        String rs = sb1.toString();
        check(rs);


    }

    public static void check(String data) {
        System.out.println(data);
    }
}
