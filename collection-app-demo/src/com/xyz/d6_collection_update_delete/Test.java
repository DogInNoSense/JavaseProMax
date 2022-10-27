package com.xyz.d6_collection_update_delete;

import com.xyz.d5_collection_list.ListDemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        // 1.准备数据
        List<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("java");
        list.add("java");
        list.add("赵敏");
        list.add("素素");

        // 需求: 删除全部的Java信息
        // a.迭代器遍历删除
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String ele = it.next();
//            if ("java".equals(ele)) {
////                list.remove("java");
//                it.remove(); // 迭代器自己的方法删除当前元素,并且不会后移 相当于 i--
//            }
//        }
//        System.out.println(list);

        // b.foreach遍历删除(会出现bug)
//        for (String s : list) {
//            if ("java".equals(ele)) {
//                list.remove("java");
//            }
//        }

        // c.lambda表达式(会出现bug)
//        list.forEach(s -> {
//            if ("java".equals(ele)) {
//                list.remove("java");
//
//            }
//        });

        // d.for循环
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if ("java".equals(ele)) {
                list.remove("java");
                i--; // 或者倒着删也可以
            }
        }
        System.out.println(list);
    }
}
