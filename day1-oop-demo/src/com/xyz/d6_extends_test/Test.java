package com.xyz.d6_extends_test;

public class Test {
    public static void main(String[] args) {
        // 目标:理解继承的设计思想
        Student s = new Student();
        s.setName("孙悟空"); // 使用父类的
        s.setAge(999);// 使用父类的
        System.out.println(s.getName());// 使用父类的
        System.out.println(s.getAge());// 使用父类的
        s.queryCourse(); // // 使用父类的
        s.writeInfo();


    }
}
