package com.xyz.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        // 解析字符串成为时间对象
        // 2021年08月06日 11:11:11 往后两天14小时49分06秒的时间是多少
        String dataStr = "2021年08月06日 11:11:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sdf.parse(dataStr); // 解析
        System.out.println(d);
//        System.out.println(d.getTime());

        long time = d.getTime() + (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 * 60 + 6) * 1000;

        // 格式化
        System.out.println(sdf.format(time));
    }
}
