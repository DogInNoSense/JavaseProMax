package com.xyz.d4_polymorphic_test;

public class KeyBoard implements USB {
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

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功连接电脑");
    }

    /*
    独有功能
     */
    public void keyDown() {
        System.out.println(name + "敲击了:666");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑拔出");
    }
}
