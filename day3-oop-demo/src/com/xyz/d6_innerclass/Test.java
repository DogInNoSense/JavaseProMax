package com.xyz.d6_innerclass;

/*
成员内部类
*/
public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.setName("内部");
        in.show();
        Outer.Inner.test(); // 访问静态方法


        System.out.println("----------------");

        Outer.Inner in1 = new Outer("爱听课").new Inner();
        in1.show();
    }
}
