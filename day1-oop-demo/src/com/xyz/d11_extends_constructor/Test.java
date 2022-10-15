package com.xyz.d11_extends_constructor;

public class Test {
    public static void main(String[] args) {
        // 学习子类构造器如何去访问父类有参数构造器
//        Teacher t = new Teacher();
//        t.setName("地雷");
//        t.setAge(18);
//        System.out.println(t.getName());
//        System.out.println(t.getAge());
        Teacher t = new Teacher("地雷", 18);
        System.out.println(t.getName());
        System.out.println(t.getAge());
    }
}
