package com.xyz.d8_attention;

public class Test {
    public static void main(String[] args) {
        // 一个类继承了抽象类,必须重写完抽象类的全部抽象方法,否则这个类也必须定义成抽象类
        // 不能用abstract修饰变量,代码块,构造器

        // 最重要的特征: 失去了创建对象的能力
//        Animal a = new Animal();// 报错

    }
}

abstract class Animal {
    public abstract void run();

    public abstract void eat();
}