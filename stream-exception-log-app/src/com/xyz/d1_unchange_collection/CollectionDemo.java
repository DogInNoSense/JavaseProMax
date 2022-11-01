package com.xyz.d1_unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        // 不可变集合
        // 1.不可变的list集合
        List<Double> lists = List.of(569.5, 700.5, 523.0, 570.5);
//        lists.add(689.0);
//        lists.set(2, 698.75);  // 不能添加,不能修改
        double score = lists.get(1);
        System.out.println(score);
        System.out.println(lists);


        // 2.不可变的set集合
        Set<String> names = Set.of("faker", "fucker", "feker", "fake");
//        names.add("fuck");
        System.out.println(names);


        // 2.不可变的Map集合
        Map<String, Integer> maps = Map.of("huawei", 2, "java开发", 1, "手表", 1);
        System.out.println(maps);

    }
}
