package com.xyz.d8_genericity_class;

public class Test {
    public static void main(String[] args) {
        // 模拟ArrayList定义一个MyArrayList
        MyArrayList<String> list = new MyArrayList<>();
        list.add("java");
        list.add("mysql");
        list.add("mysql");
        list.remove("mysql");
        System.out.println(list);
    }
}
