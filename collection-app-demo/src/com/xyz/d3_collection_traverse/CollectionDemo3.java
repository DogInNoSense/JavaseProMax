package com.xyz.d3_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("素素");
        lists.add("灭绝");
        System.out.println(lists);

//        lists.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        lists.forEach(s -> {
//            System.out.println(s);
//        });
        lists.forEach(s -> System.out.println(s));
        lists.forEach(System.out::println);

    }
}
