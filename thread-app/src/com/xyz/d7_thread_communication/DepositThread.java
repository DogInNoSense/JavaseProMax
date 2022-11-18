package com.xyz.d7_thread_communication;


/**
 * 存钱的线程类
 */
public class DepositThread extends Thread {
    // 接收处理的账户对象
    private Account acc;

    public DepositThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 小明小红:取钱的
        while (true) {
            acc.depositMoney(100000);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
