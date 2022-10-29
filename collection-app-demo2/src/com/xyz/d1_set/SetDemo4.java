package com.xyz.d1_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        // 有序 不重复 无索引
        Set<String> sets = new LinkedHashSet<>();
        sets.add("mysql");
        sets.add("mysql");
        sets.add("java");
        sets.add("java");
        sets.add("html");
        sets.add("html");
        sets.add("springboot");
        sets.add("springboot");
        System.out.println(sets);
    }

}
