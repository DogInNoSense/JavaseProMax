package com.xyz.d7_thread_communication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String CardId;
    private double money;   // 账户的余额
    // final修饰后,锁对象是唯一和不可替换的
    private final Lock lock = new ReentrantLock();

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
    public synchronized void drawMoney(double money) {

        String name = Thread.currentThread().getName();
        try {
            if (this.money >= money) {
                this.money -= money;
                System.out.println(name + "取钱" + money + "成功!取钱后的余额是:" + this.money);
                try {
                    this.notifyAll();  // 唤醒所有线程
                    this.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                // 钱不够
                // 唤醒别人,等待自己
                this.notifyAll(); // 唤醒所有线程
                this.wait(); // 锁对象让当前线程进入等待
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void depositMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money == 0) {
                // 存钱
                this.money += money;
                System.out.println(name + "存钱" + money + "成功!存完后余额是:" + this.money);
                // 有钱了: 唤醒别人等待自己
                this.notifyAll(); // 唤醒所有线程
                this.wait(); // 锁对象让当前线程进入等待
            } else {
                // 有钱 不存钱
                this.notifyAll(); // 唤醒所有线程
                this.wait(); // 锁对象让当前线程进入等待
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
