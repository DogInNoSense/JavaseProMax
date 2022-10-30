package com.xyz.d6_map_api;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // 1.添加元素: 无序,不重复,无索引
        Map<String, Integer> maps = new HashMap<>();
        maps.put("iphoneX", 10);
        maps.put("娃娃", 32);
        maps.put("iphoneX", 100);
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        System.out.println(maps);

        // 2.清空集合
//        maps.clear();
//        System.out.println(maps);

        // 3.判断集合是否为空
        System.out.println(maps.isEmpty());


        // 4.根据键获取对应值
        Integer key = maps.get("huawei");
        System.out.println(key);
        System.out.println(maps.get("生活用品"));
        System.out.println(maps.get("生活用品2")); // null

        // 5.根据键删除整个元素,(删除键会返回键的值)
        System.out.println(maps.remove("iphoneX"));

        // 6.判断是否包含某个键,包含返回true
        System.out.println(maps.containsKey("娃娃")); // true
        System.out.println(maps.containsKey("iphoneX")); // false

        // 7.判断是否包含某个值
        System.out.println(maps.containsValue(100));
        System.out.println(maps.containsValue(10));
        System.out.println(maps.containsValue(22));

        // 8.获取全部键的集合
        Set<String> strings = maps.keySet();
        System.out.println(strings);

        System.out.println("-------------------------------");

        // 9.获取全部值的集合
        Collection<Integer> values = maps.values();
        System.out.println(values);

        // 10.集合的大小
        System.out.println(maps.size());

        // 11.合并其他Map集合(拓展)

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("java1", 1);
        map1.put("java2", 100);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("java2", 1);
        map2.put("java3", 100);
        map1.putAll(map2); // 把集合map2的元素拷贝到map1
        System.out.println(map1);
        System.out.println(map2);

    }
}
