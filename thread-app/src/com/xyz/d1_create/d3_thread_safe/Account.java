package com.xyz.d1_create.d3_thread_safe;

public class Account {
    private String CardId;
    private double money;   // 账户的余额

    public Account() {
    }

    public Account(String cardId, double money) {
        CardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return CardId;
    }

    public void setCardId(String cardId) {
        CardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * 小明小红同时启动
     */
    public void drawMoney(double money) {
        // 0.获取谁来取钱
        String name = Thread.currentThread().getName();
        // 同步代码块
        // 小明 小红
        // this==acc 共享账户


            // 1.判断账户是否够钱
            if (this.money >= money) {
                // 2.取钱
                System.out.println(name + "来取钱成功" + money);
                // 3.更新余额
                this.money -= money;
                System.out.println(name + "取钱后剩余:" + this.money);
            } else {
                System.out.println(name + "来取钱,余额不足");
            }
        }

}
