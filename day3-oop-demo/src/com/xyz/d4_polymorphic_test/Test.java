package com.xyz.d4_polymorphic_test;

/*
    1.定义usb接口: 接入 拔出
    2.定义2个usb的实现类,鼠标 键盘
    3.创建一个电脑对象,创建usb对象,安装启动
 */
public class Test {
    public static void main(String[] args) {
        // a.创建电脑对象
        Computer c = new Computer("华南");
        c.start();
        // b.创建键盘 鼠标

        // 多态
        USB u1 = new KeyBoard("双飞燕");
        c.installUSB(u1);

        System.out.println("-------------------------");
        USB u2 = new KeyBoard("罗技鼠标");
        c.installUSB(u2);


    }
}
