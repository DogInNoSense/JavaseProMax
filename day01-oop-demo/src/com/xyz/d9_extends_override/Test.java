package com.xyz.d9_extends_override;

public class Test {
    public static void main(String[] args) {
        // 方法重写
        NewPhone hw = new NewPhone();
        hw.call();
        hw.sendMsg();
    }
}

/*
旧手机:父类的
 */
class Phone {
    public void call() {
        System.out.println("打电话");
    }

    public void sendMsg() {
        System.out.println("发短信");
    }
}

class NewPhone extends Phone {
    // 重写的方法
    public void call() {
        super.call();// 先用他爸的基本功能
        System.out.println("开始视频通话");
    }

    // 重写的方法
    public void sendMsg() {
        super.sendMsg();
        System.out.println("发送有趣的图片");
    }
}