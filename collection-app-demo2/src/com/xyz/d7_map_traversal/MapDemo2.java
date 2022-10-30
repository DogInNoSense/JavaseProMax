package com.xyz.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("iphoneX", 10);
        maps.put("娃娃", 32);
        maps.put("iphoneX", 100);
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        System.out.println(maps);

        // 1.把map集合转换成Set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        // 2.开始遍历
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "==>" + value);
        }

    }
}