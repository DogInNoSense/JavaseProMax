package com.xyz.d6_extends_test;

public class Student extends People {
    private String className;

    /*
    子类
     */
    // 独有的行为,填写反馈信息
    public void writeInfo() {
        System.out.println(getName() + "学习语法");
    }


}
