package com.xyz.d5_innerclass_static;

/*
外部类
 */
public class Outer {
    /*
    静态成员内部类
    类的成分他都有
    */
    public static int a = 100;
    private String hobby;

    public static class Inner {
        private String name;
        private int age;
        public static String schoolName;

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void show() {
            System.out.println("名称:" + name);
            System.out.println(a);
            // 可以访问外部类的静态成员

            Outer o = new Outer();
            System.out.println(o.hobby);
            // 间接访问
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

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }
    }
}
