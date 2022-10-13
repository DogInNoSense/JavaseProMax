package com.xyz.d7_abstract_test;

public class Test {
    public static void main(String[] args) {
        // 学习抽象类的基本使用
        GoldCard c = new GoldCard();
        c.setMoney(10000);
        c.setUserName("xyz");
        c.pay(300);
        System.out.println("剩余金额:" + c.getMoney());
    }
}
