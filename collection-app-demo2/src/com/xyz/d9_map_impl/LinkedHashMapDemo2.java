package com.xyz.d9_map_impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        // map体系的特点: 按照键无序,不重复,无索引,值不做要求
        // 1.创建一个map对象
        Map<String, Integer> maps = new LinkedHashMap<>(); // 经典代码
        maps.put("鸿星尔克", 3);
        maps.put("Java", 1);
        maps.put("枸杞", 10);
        maps.put("Java", 10); // 覆盖前面的Java数据
        maps.put(null, null);
        System.out.println(maps); // 打印内容,改写了 toString 方法

    }
}
