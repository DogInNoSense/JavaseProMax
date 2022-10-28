package com.xyz.d7_genericity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericityDemo {
    // 泛型概述
    // 泛型就是一个标签: <数据类型>,泛型可以在编译阶段约束只能操作某种数据类型
    // 泛型就是一个标签.泛型可以在编译极端约束只能操作某种数据类型
    // 泛型只能支持引用数据类型
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java1");
//        list.add(23);

        List<String> list1 = new ArrayList<>();
        list1.add("java");
//        list1.add(23.3);
//        list1.add(false);
        list1.add("Spring");

//        for (Object o : list1) {
//            String ele = o + "";
//            System.out.println(ele);
//        }

        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println("---------------------------");
        // 支持存储任意类型
        List<Object> list2 = new ArrayList<>();
        list2.add("java");
        list2.add(23.3);
        list2.add(false);
        list2.add("Spring");

        List<Object> list3 = new ArrayList<>();


    }
}
