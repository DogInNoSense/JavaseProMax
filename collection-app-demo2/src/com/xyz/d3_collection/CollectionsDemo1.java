package com.xyz.d3_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//        names.add("楚留香");
//        names.add("胡铁花");
//        names.add("张无忌");
//        names.add("陆小凤");
        Collections.addAll(names, "楚留香", "胡铁花", "张无忌", "陆小凤");
        System.out.println(names);


        // 2.public static void shuffle(List<?> list) :打乱集合顺序
        Collections.shuffle(names);
        System.out.println(names);

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 12, 32, 22, 4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }
}
