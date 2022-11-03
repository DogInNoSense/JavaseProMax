package com.xyz.d3_exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        // 1.数组索引越界异常:ArrayIndexOutOfBoundsException
//        int arr[] = {10, 20, 40};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println("----结束----");

        // 2.空指针异常
//        String name = null;
//        System.out.println(name);
//        System.out.println(name.length());

        // 3.类型转换异常
        Object o = 23;
        //  String s = (String) o; // 运行出错


        // 4. 数字操作异常
        int c = 1 / 0;

        // 5.数字转换异常
//        String number = "23";
//        Integer it = Integer.valueOf(number);
//        System.out.println(it + 1);
    }
}
