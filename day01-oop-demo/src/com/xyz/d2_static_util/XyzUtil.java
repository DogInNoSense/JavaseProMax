package com.xyz.d2_static_util;

import java.util.Random;

public class XyzUtil {
    /*
    工具类,不用实例方法做 可以降低内存 因为实例方法要创建对象
    工具类里面都是静态方法,直接用类名即可访问,因此,工具类无需创建对象,建议将工具类的构造器私有
     */
    private XyzUtil() {

    }

    public static String createVerifyCode(int n) {
        // 开发一个验证码
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
//        System.out.println("验证码" + code);
        return code;
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
