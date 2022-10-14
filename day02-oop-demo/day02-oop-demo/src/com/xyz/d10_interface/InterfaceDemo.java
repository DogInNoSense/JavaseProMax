package com.xyz.d10_interface;

/*
声明了一个接口,体现一种规范,规范要公开(可以不写public和abstract)
 */
public interface InterfaceDemo {
    // 接口中的成分特点: JDk 8之前接口只能有抽象方法和常量
    // 1.常量

    static final String SCHOOL_name = "黑马";
//    static final String SCHOOL_name = "黑马";

    void run();

    void eat();

//    public abstract void eat();


}
