package com.xyz.d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        // HashSet: 添加的元素无序,不重复,无索引
        Collection<String> c = new ArrayList<>();
        // 1.添加元素,添加成功返回true
        c.add("java");
        c.add("html");
        c.add("html");
        c.add("mysql");
        c.add("java");
        c.add("黑马");
        System.out.println(c);

        // 2.清空集合的元素
//        list.clear();
//        System.out.println(list);

        // 3.判断集合是否为空
        System.out.println(c.isEmpty()); // 为空返回true

        // 4.获取集合的大小
        System.out.println(c.size());

        // 5.判断集合中是否包含某个元素
        System.out.println(c.contains("java"));
        System.out.println(c.contains("Java"));

        // 6.删除某个元素
        c.remove("java");
        System.out.println(c);

        // 7.把集合转换成数组 [html, html, mysql, java, 黑马]
        Object[] arrs = c.toArray();
        System.out.println("数组:" + Arrays.toString(arrs));

        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("xyz");
        c2.add("zyx");
        // addAll把c2的集合的所有元素倒入到c1中去
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);

    }
}
