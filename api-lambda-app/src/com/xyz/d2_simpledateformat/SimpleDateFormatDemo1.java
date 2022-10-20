package com.xyz.d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) {
        // 简单日期格式化
        // 1.日期对象
        Date d = new Date();
        System.out.println(d);


        // 2.格式化日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");

        // 3.开始格式化成字符串形式
        String rs = sdf.format(d);
        System.out.println(rs);

        // 4.格式化时间毫秒值
        // 需求: 请问121秒后的时间是多少
        long time1 = System.currentTimeMillis() + 121 * 1000;
        String rs2 = sdf.format(time1);
        System.out.println(rs2);


        // 解析字符串时间

    }
}
