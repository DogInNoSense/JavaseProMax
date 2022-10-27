package com.xyz.d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("java1");
        lists.add("java2");
        lists.add("java3");

//        for 循环
        for (int i = 0; i < lists.size(); i++) {
            String ele = lists.get(i);
            System.out.println(ele);
        }


//        迭代器
        System.out.println("--------------------");
        Iterator<String> it = lists.iterator();
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }

//        for each
        System.out.println("-----------------------");
        for (String list : lists) {
            System.out.println(list);
        }

    }
}
