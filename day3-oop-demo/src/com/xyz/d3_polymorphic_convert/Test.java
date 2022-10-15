package com.xyz.d3_polymorphic_convert;


public class Test {
    public static void main(String[] args) {
        // 自动类型转换
        Animal a = new Dog();
        a.run();


        // 强制类型转换
        Animal a2 = new Tortoise();
        a2.run();
        Tortoise t = (Tortoise) a2; // 父类类型到子类类型必须强制类型转换
        t.layEggs();

        Dog d = (Dog) a;
        d.lookDoor();


    }
}
