package com.xyz.d10_extends_constructor;

public class Dog extends Animal {
    public Dog() {
//        super(); // 写不写都有
        System.out.println("子类构造器被执行~");
    }

    public Dog(String name) {
        System.out.println("子类Dog有参数构造器被执行");
    }
}
