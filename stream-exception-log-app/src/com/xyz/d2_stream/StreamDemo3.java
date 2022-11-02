package com.xyz.d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张");
//            }
//        });
        list.stream().filter((String s) -> s.startsWith("张")).forEach(s -> System.out.println(s));
        long size = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(size);

//        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);
        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println); // 跳过前两个元素

        // Map加工方法
        // 给集合元素的前面都加上一个黑马的:
//        list.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return "黑马的:" + s;
//            }
//        });

        list.stream().map(s -> "黑马的:" + s).forEach(s -> System.out.println(s));

        // 把所有的名称都加工成一个学生对象
        list.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));

        // 合并流
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("java1", "javaa2");
        Stream<String> s3 = Stream.concat(s1, s2);
    }
}
