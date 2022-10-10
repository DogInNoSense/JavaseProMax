package com.xyz.d4_static_singleinstance;

public class SingleInstance2 {
    /*
    私有化构造器
     */
    /*
    2.定义一个静态的成员变量负责存储一个对象
   只加载一次,只有一份
   注意: 最好私有化,这样可以避免被别人用点的方式拿到
     */
    private static SingleInstance2 instance;

    /*
    3.提供一个方法,对外返回单例对象
     */
    public static SingleInstance2 getInstance() {
        if (instance == null) {
            // 第一次拿对象,此时需要创建对象
            instance = new SingleInstance2();
        }
        return instance;
    }

    private SingleInstance2() {

    }
}
