package com.xyz.d9_map_impl;

import java.util.*;

/*
需求: 统计投票人数
 */
public class MapTest4 {
    public static void main(String[] args) {
        // 1.要求程序记录每个学生选择的情况
        // 使用一个map集合存储
        Map<String, List<String>> data = new HashMap<>();

        // 2.把学生选择的数据存入进去
        List<String> selects = new ArrayList<>();
        Collections.addAll(selects, "A", "B");
        data.put("罗勇", selects);

        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1, "A", "B", "C");
        data.put("胡涛", selects1);


        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2, "A", "B", "C", "D");
        data.put("刘军", selects2);
        System.out.println(data);

        // 3.统计每个景点选择的人数
        Map<String, Integer> infos = new HashMap<>();

        // 4.提取所有人选择的景点的信息
        Collection<List<String>> values = data.values();
        // values = [[A,B,C,D],[B,C,D],[A,C]]
        //              value
        // java中<>表示使用泛型，Array<List<String>>表示的意思是一个数组里面存放的是list集合，而该list集合中存储的是字符串类型的数据
        for (List<String> value : values) {
            for (String s : value) {
                // 有没有包含这个景点
                if (infos.containsKey(s)) {
                    infos.put(s, infos.get(s) + 1);
                } else {
                    infos.put(s, 1);
                }

            }
        }
        System.out.println(infos);
    }


}

