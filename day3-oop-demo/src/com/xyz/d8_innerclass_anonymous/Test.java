package com.xyz.d8_innerclass_anonymous;

/*
匿名内部类
1. 方便创建子类对象 最终目的为了简化代码编写
2. 匿名内部类是一个没有名字的内部类
3. 匿名内部类写出来就会产生一个匿名内部类的对象
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑的快");
            }
        };
        a.run();
    }
}
// 可以不需要再定义子类

//class Tiger extends Animal {
//
//    @Override
//    public void run() {
//        System.out.println("老虎跑的快");
//    }
//}

abstract class Animal {
    public abstract void run();
}
