package com.xyz.d2_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // Collection集合获取流
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();

        // Map集合获取流
        Map<String, Integer> maps = new HashMap<>();

        // 键流
        Stream<String> keyStream = maps.keySet().stream();
        // 值流
        Stream<Integer> valueStream = maps.values().stream();
        // 键值对(拿整体)
        Stream<Map.Entry<String, Integer>> keyValuesStream = maps.entrySet().stream();

        // 数组获取流
        String[] names = {"赵薇", "小昭", "灭绝", "周芷若"};
        Stream<String> nameStream = Arrays.stream(names);

        Stream<String> nameStream2 = Stream.of(names);
    }
}
