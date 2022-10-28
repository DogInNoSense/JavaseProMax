package com.xyz.d1_set;

public class SetDemo2 {
    public static void main(String[] args) {
        // 获取对象的哈希值,并确认一下
        String name = "xyz";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());

        String name1 = "zyx";
        System.out.println(name1.hashCode());
        System.out.println(name1.hashCode());
    }
}
