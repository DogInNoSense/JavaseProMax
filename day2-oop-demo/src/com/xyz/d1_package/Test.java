package com.xyz.d1_package;

// 导包

import com.xyz.d1_package.it.Student;

public class Test {
    public static void main(String[] args) {
        // 1.同一个包下的类 可以互相访问
        System.out.println(User.onlineNumber);
        // 2.不同包下的类必须先导包
        Student s = new Student();
        // 3.如果这个类中使用不同包下的相同的类名,此时,默认只能导入一个类的包
        com.xyz.d1_package.it2.Student s2 = new com.xyz.d1_package.it2.Student();

    }
}
