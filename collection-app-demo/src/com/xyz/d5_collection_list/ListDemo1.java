package com.xyz.d5_collection_list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // 1.创建一个ArrayList集合对象
        // List:有序,可重复,有索引的
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("my sql");
        list.add("my sql");

        // 2.在某个索引位置插入元素

        list.add(2, "html");
        System.out.println(list);


        // 3.根据索引位置删除元素,返回被删除元素
        System.out.println(list.remove(2));

        // 4.根据索引获取元素
        System.out.println(list.get(2));

        // 5.修改索引位置处的元素,返回修改前的元素
        System.out.println(list.set(1, "xyzyyds"));
        System.out.println(list);

    }
}
