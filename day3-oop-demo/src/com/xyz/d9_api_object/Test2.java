package com.xyz.d9_api_object;

/*
   掌握object类中equals方法的使用
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("周熊", '男', 19);
        Student s2 = new Student("周熊", '男', 19);
        System.out.println(s1.equals(s2)); // 默认是比较地址是否相同 (这里的s1 和 s2 不是String类型)
        System.out.println(s1 == s2); // 比较地址
    }
}
