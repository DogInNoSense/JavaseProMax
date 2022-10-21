package com.xyz.d6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxDemo5 {
    // 正则表达式爬取信息中的内容
    public static void main(String[] args) {
        String rs = "来黑马程序学习Java,电话020-123231,或者联系邮箱" + "16232123@xxx.com,电话18888888888" + "邮箱bozai@itcast.cn,400-966-6699";
        // 从上面的内容中爬取出 电话号码和邮箱
        // 1.定义爬取规则,字符串形式
        String regex = "(\\w{1,30}@[a-zA-z0-9]{2,10}(\\.[a-zA-z0-9]{2,20}){1,2})" +
                "|(1[3-9]\\d{9})|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}\\d{3,9})";
        // 2.把这个爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        // 3.得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(rs);

        // 4.开始查找
        while (matcher.find()) {
            String rs1 = matcher.group();
            System.out.println(rs1);
        }


    }
}
