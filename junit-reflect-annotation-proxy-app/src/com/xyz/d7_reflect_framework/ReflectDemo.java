package com.xyz.d7_reflect_framework;

import java.util.ArrayList;

/**
 * 提供一个通用框架,支持保存所有对象的具体信息.
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        s.setName("猪八戒");
        s.setClassName("跑路1班");
        s.setAge(1000);
        s.setHobby("吃,睡");
        s.setSex('男');
        MybatisUtil.save(s);

        Teacher t = new Teacher();
        t.setName("BoZai");
        t.setSex('男');
        t.setSalary(6000);
        MybatisUtil.save(t);
    }
}
