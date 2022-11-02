package com.xyz.d2_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
收集Stream流的数据到 集合或者数组中去
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        System.out.println(s1);
//        List<String> zhangList = s1.collect(Collectors.toList());
//        System.out.println(zhangList);
        List<String> list1 = s1.toList(); // 得到不可变集合
        System.out.println(list1);


        // 注意流只能使用1次
        //   Set<String> zhangSet = s1.collect(Collectors.toSet());
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));
        Set<String> zhangSet = s2.collect(Collectors.toSet());
        System.out.println(zhangSet);


        Stream<String> s3 = list.stream().filter(s -> s.startsWith("张"));
        // 打成数组
        Object[] arrs = s3.toArray();
        System.out.println(Arrays.toString(arrs));
    }
}
