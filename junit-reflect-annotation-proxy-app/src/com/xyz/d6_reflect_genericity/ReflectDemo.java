package com.xyz.d6_reflect_genericity;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo {
    public static void main(String[] args) {
        ArrayList<String> lists1 = new ArrayList<>();
        ArrayList<Integer> lists2 = new ArrayList<>();

        System.out.println(lists1.getClass());
        System.out.println(lists2.getClass());

        System.out.println(lists1.getClass() == lists2.getClass());

        System.out.println("--------------------------");
        ArrayList<Integer> lists3 = new ArrayList<>();
        lists3.add(23);
        lists3.add(22);
//
//        Class c = lists3.getClass();
//        Method add = c.getDeclaredMethod("add", Object.class);
//        boolean rs = (boolean) add.invoke(lists3, "黑马");
//
//        System.out.println(rs);
//        System.out.println(lists3);



    }
}
