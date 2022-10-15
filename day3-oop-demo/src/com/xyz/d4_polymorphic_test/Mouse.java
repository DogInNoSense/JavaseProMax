package com.xyz.d4_polymorphic_test;

public class Mouse implements USB {
    /*
         实现类
    */
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功连接电脑");
    }

    /*
    独有功能
     */
    public void dbClick() {
        System.out.println(name + "一键三连");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑拔出");
    }
}
