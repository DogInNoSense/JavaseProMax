package com.xyz.d7_thread_communication;


/**
 * 取钱的线程类
 */
public class DrawThread extends Thread {
    // 接收处理的账户对象
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 小明小红:取钱的
        while (true) {
            acc.drawMoney(100000);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
