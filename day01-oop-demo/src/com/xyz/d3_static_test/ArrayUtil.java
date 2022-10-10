package com.xyz.d3_static_test;

public class ArrayUtil {
    /*
    完成数组工具类的设计
     */
    private ArrayUtil() {

    }

    /*
    工具方法:静态方法
     */
    public static String toString(int arr[]) {
        // 1.一些校验
        if (arr == null) {
            return null;
        }
        // 2.拼接返回内容
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        result += "]";
        return result;
    }

}
