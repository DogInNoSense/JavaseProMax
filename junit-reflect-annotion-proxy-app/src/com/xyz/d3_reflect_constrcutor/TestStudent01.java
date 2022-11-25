package com.xyz.d3_reflect_constrcutor;

import org.junit.Test;

import java.lang.constant.Constable;
import java.lang.reflect.Constructor;

public class TestStudent01 {
    @Test
    public void getConstructors() {
        Class c = Student.class;
        // 提取类中的全部的构造器对象
        Constructor[] constructors = c.getConstructors();
        // 遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }
    }

    @Test
    public void getDeclaredConstructors() {
        Class c = Student.class;
        // 提取类中的全部的构造器对象
        Constructor[] constructors = c.getDeclaredConstructors();
        // 遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }
    }

    @Test
    public void getConstructor() throws Exception {
        Class c = Student.class;
        Constructor cons = c.getConstructor();
        System.out.println(cons.getName() + "===>" + cons.getParameterCount());
    }


    @Test
    public void getDeclaredConstructor() throws Exception {
        Class c = Student.class;
        Constructor cons = c.getDeclaredConstructor();
        System.out.println(cons.getName() + "===>" + cons.getParameterCount());

        // 私有构造器 可以暴力反射
        cons.setAccessible(true); // 权限被打开
        Student s = (Student) cons.newInstance();
        System.out.println(s);

        Constructor cons1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(cons1.getName() + "===>" + cons1.getParameterCount());
        Student s1 = (Student) cons1.newInstance("孙悟空", 1000);
        System.out.println(s1);
    }


}
