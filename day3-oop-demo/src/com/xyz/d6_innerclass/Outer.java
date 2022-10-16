package com.xyz.d6_innerclass;

/*
外部类
 */
public class Outer {
    /**
     * 成员内部类 不能加static修饰
     */
    public static int num = 111;
    private String hobby;

    public Outer() {
    }

    public Outer(String hobby) {
        this.hobby = hobby;
    }

    public class Inner {
        private String name;
        private int age;
        public static int a; // JDK 16开始支持

        public static void test() {

        }

        public void show() {
            System.out.println("名称:" + name);
            System.out.println("数值:" + num);
            System.out.println("爱好:" + hobby);
            // 允许访问
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static int getA() {
            return a;
        }

        public static void setA(int a) {
            Inner.a = a;
        }
    }
}
