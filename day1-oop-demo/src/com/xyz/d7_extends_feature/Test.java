package com.xyz.d7_extends_feature;

public class Test {
    public static void main(String[] args) {
        // 目标:理解继承的方法
        // 1.子类不能继承父类的构造器
        // 2.子类是否可以继承父类的私有成员?不能直接访问

        Tiger t = new Tiger();
        // 3.子类是否可以继承父类的静态成员
        System.out.println(Tiger.location);
    }
}

class Animal {
    private void eat() {
        System.out.println("动物要吃东西");
    }

    public static String location = "动物园";
}

class Tiger extends Animal {

}
