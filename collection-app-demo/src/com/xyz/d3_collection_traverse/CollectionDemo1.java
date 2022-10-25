package com.xyz.d3_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("素素");
        lists.add("灭绝");
        System.out.println(lists);

        System.out.println("----------------");

        // 1.得到当前集合的迭代器对象
        Iterator<String> it = lists.iterator();
//        String ele = it.next();
//        System.out.println(ele);
//        System.out.println(it.next());

        System.out.println("------------------");

        // 2.定义while循环
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }

    }
}
