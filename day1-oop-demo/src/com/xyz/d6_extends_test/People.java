package com.xyz.d6_extends_test;

public class People {
    private String name;
    private int age;

    /*
    查看课表
     */

    public void queryCourse() {
        System.out.println(name + "在查看课表");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
