package com.xyz.d14_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // 浮点型运算的时候直接+ * / 可能会出现数据失真(数据精度问题)
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);

        System.out.println("----------------------");

        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("---------------------");

        // 包装浮点型数据转换为大数据对象 BigDecimal
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        BigDecimal c2 = a1.subtract(b1);
        BigDecimal c3 = a1.multiply(b1);
        BigDecimal c4 = a1.divide(b1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        // 转换成double类型方便别人接受
        double rs = c1.doubleValue();
        System.out.println(rs);
        // 注意: BigDecimal一定要精度运算
        System.out.println("---------------------");
        BigDecimal a11 = BigDecimal.valueOf(10);
        BigDecimal b11 = BigDecimal.valueOf(3);
        BigDecimal c11 = a11.divide(b11, 2, RoundingMode.HALF_UP);// 保留2位小数 四舍五入
        System.out.println(c11);

    }
}
