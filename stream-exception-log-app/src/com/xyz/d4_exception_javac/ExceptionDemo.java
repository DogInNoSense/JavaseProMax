package com.xyz.d4_exception_javac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        String date = "2027-01-12 10:23:21";
        // 创建一个简单日期格式化类 解析字符串时间成为日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 解析字符串成日期对象
        Date d = sdf.parse(date);

        System.out.println(d);
    }
}
