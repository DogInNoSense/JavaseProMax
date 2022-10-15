package com.xyz.d1_polymorphic;

public class Test {
    public static void main(String[] args) {
        // 1.多态的形式 父类类型 对象名称 = new 子类构造器;
        Dog d = new Dog();
        d.run(); // 编译看左,运行看右边
        System.out.println(d.name); // ??

        Tortoise t = new Tortoise();
        t.run(); // 编译看左,运行看右边
        System.out.println(t.name);
    }
}
