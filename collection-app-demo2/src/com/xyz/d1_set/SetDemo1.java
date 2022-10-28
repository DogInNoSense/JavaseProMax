package com.xyz.d1_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        // set系列集合的特点: HashSet LinkedHashSet TreeSet
        // 无序 不重复 无索引
        Set<String> sets = new HashSet<>();
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
