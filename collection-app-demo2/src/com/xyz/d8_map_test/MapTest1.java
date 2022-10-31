package com.xyz.d8_map_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.SplittableRandom;

/*
需求: 统计投票人数
 */
public class MapTest1 {
    public static void main(String[] args) {
        // 1.把80个学生选择的数据拿进来
        String[] selects = {"A", "B", "C", "D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]); // 随机0到3的索引并且拼到sb
        }
        System.out.println(sb);

        // 2.定义一个Map集合记录最终统计的结果: A=30 B=20 C=10 D=20
        Map<Character, Integer> infos = new HashMap<>();

        // 3.遍历80个学生选择的数据
        for (int i = 0; i < sb.length(); i++) {
            // 4.提取当前选择字符
            char ch = sb.charAt(i);
            // 5.判断这个map集合中是否存在这个键
            if (infos.containsKey(ch)) {
                // 让其值加1
                infos.put(ch, infos.get(ch) + 1);
            } else {
                // 第一次出现这个键
                infos.put(ch, 1);
            }
        }
        // 4.输出map集合
        System.out.println(infos);
    }
}
