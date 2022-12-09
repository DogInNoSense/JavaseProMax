package com.xyz.d9_proxy;

public class Test {
    public static void main(String[] args) {
        // 1.创建一个对象
        Star s = new Star("杨超越");
        s.jump();
        s.sing();

        // 2.生成一个代理对象
        Skill s2 = new StarAgentProxy().getProxy(s);
        s2.jump();
//        s2.sing();
    }
}
