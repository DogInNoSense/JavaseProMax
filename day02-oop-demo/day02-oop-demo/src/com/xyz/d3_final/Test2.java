package com.xyz.d3_final;

import org.w3c.dom.ls.LSOutput;

public class Test2 {
    // final修饰变量
    // a.局部变量
    // b.成员变量 1.实例成员变量 2.静态成员变量
    /*
    二.修饰静态成员变量(常量)
     */
    public static final String schoolName = "黑马";

    /*
    三.修饰实例成员变量(几乎不用)
     */
    private final String name = "猪八戒";


    /*
    一.修饰局部成员变量
     */
    public static void main(String[] args) {
        final double rate = 3.14;
        buy(0.8);
        Test2 t = new Test2();
        System.out.println(t.name);
//        t.name = "孙悟空";

        // final修饰引用类型的变量,其地址值不能改变,但是指向的对象的内容可以改变
        final Teacher t2 = new Teacher("教课");
        System.out.println(t2.getHobby());
//        t2 = null; // 地址不能改变
        t2.setHobby("上网");
        System.out.println(t2.getHobby());
    }


    public static void buy(final double z) {

    }

    static class Teacher {
        // static???
        private String hobby;

        public Teacher(String hobby) {
            this.hobby = hobby;
        }

        public void setHobby(String hobby) {
            this.hobby = hobby;
        }

        public String getHobby() {
            return hobby;
        }
    }

}
