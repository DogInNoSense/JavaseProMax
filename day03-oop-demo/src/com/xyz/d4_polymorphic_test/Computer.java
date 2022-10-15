package com.xyz.d4_polymorphic_test;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println(name + "品牌电脑开机");
    }

    /*
    提供安装USB的入口
     */
    public void installUSB(USB usb) {
        // 多态: 可能是鼠标 也可能是键盘
        usb.connect();
        // 独有功能 先判断 再强转
        if (usb instanceof KeyBoard) {
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        } else if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.dbClick();
        }
        usb.unconnect();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
