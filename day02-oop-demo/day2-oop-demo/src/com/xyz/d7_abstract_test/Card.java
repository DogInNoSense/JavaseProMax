package com.xyz.d7_abstract_test;

public abstract class Card {
    private String userName;
    private double money;

    /*
    定义一个支付方法,表示卡片可以支付
    抽象方法
     */
    public abstract void pay(double money);

    public String getUserName() {
        return userName;
    }

    public double getMoney() {
        return money;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
