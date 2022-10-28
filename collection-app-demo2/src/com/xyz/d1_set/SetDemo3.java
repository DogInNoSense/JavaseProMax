package com.xyz.d1_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        // 让set集合把重复内容的对象去掉一个(去重复)
        // set集合去重复原因: 先判断哈希值,再删除equals
        Set<Student> sets = new HashSet<>();
        Student s1 = new Student("小刘", 20, '男');
        Student s2 = new Student("小刘", 20, '男');
        Student s3 = new Student("小张", 21, '男');
        // 重写hashcode和equals方法
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode()); // hashcode一样


        sets.add(s1);
        sets.add(s2);
        sets.add(s3);


        System.out.println(sets);


    }

}
