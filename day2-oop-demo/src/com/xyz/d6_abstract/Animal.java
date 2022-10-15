package com.xyz.d6_abstract;

/*
抽象类
 */
public abstract class Animal {
    /*
    抽象方法
     */
    // 当父类知道子类一定要完成某些行为,但是每个子类该行为的实现又不同,于是该父类就把该行为定义成抽象方法
    // 抽象类中不一定有抽象方法,有抽象方法必须是抽象类
    private String name;

    public abstract void run();
    // getter setter
}
