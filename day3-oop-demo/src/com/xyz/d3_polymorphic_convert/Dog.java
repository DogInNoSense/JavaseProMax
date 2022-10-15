package com.xyz.d3_polymorphic_convert;

public class Dog extends Animal {
    public String name = "子类狗";

    @Override
    public void run() {
        System.out.println("狗跑的贼慢!");
    }

    public void lookDoor() {
        System.out.println("狗会看门");
    }
}
