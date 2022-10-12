package com.xyz.d3_final;

public class Test {
    public static void main(String[] args) {
        // final的语法
        // 1.final修饰类 类不能被继承
        // 2.final修饰方法 方法不能被重写
        // 3.final修饰变量 变量只能赋值一次

    }
}

//class Wolf extends Animal {
//
//}
// 工具类可以加final

final class Animal {

}

class Student extends People {
//    @Override
//    public void eat() {
//        System.out.println("学生吃的多");
//    }
}

class People {
    public final void eat() {
        System.out.println("人要吃东西");
    }
}
