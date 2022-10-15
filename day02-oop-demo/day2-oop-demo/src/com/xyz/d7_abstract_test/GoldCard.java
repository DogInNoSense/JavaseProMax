package com.xyz.d7_abstract_test;

public class GoldCard extends Card {
    @Override
    public void pay(double money2) {
        System.out.println("您当前消费:" + money2);
        System.out.println("您卡片余额:" + getMoney());
        // 优惠价
        double rs = money2 * 0.8;
        System.out.println(getUserName() + ",您实际支付:" + rs);
        // 更改账户余额
        setMoney(getMoney() - rs);
    }
}
