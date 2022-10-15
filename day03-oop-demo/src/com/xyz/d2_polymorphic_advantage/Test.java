package com.xyz.d2_polymorphic_advantage;

public class Test {
    public static void main(String[] args) {
        Animal t = new Tortoise();
        go(t);

        Animal d = new Dog();
        go(d);
//        d.lookDoor();
        // 多态下不能访问子类独有功能
    }

    /*
    要求:所有的动物都可以比赛
     */
    public static void go(Animal a) {
        System.out.println("开始..");
        a.run();
        System.out.println("结束...");

    }
}
