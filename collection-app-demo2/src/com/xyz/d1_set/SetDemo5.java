package com.xyz.d1_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
TreeSet对于有值特性的数据如何排序
对自定义类型的对象进行指定规则排序
 */
public class SetDemo5 {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>(); // 不重复 无索引 可排序
        sets.add(23);
        sets.add(24);
        sets.add(12);
        sets.add(8);
        System.out.println(sets);

        Set<String> sets1 = new TreeSet<>(); // 不重复 无索引 可排序
        sets1.add("java");
        sets1.add("java");
        sets1.add("angel");
        sets1.add("中国");
        sets1.add("about");
        sets1.add("python");
        sets1.add("UI");
        sets1.add("UI");
        System.out.println(sets1);  // 按首字母编号排序


        System.out.println("-------------------------");
        // 方式2: 集合自带比较器对象进行规则定制
        Set<Apple> apples = new TreeSet<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
//                return o1.getWeight() - o2.getWeight(); //  升序
                // 浮点型建议直接使用Double.compare进行比较
                return Double.compare(o2.getPrice(), o1.getPrice()); // 降序
            }
        });
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿苹果", "青色", 29.9, 400));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));
        System.out.println(apples);

    }
}
