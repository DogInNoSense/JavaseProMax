package com.xyz.d7_thread_communication;

public class ThreadDemo {
    public static void main(String[] args) {
        // 了解线程通信的流程
        // 使用3个爸爸存钱(生产者) 2个孩子取钱(消费者) 模拟线程通信思想(一存 一取)
        // 5个人用的同一把锁

        // 1.创建账户对象,代表5个人共通操作的账户
        Account acc = new Account("ICBC-112", 0);

        // 2.创建2个取钱线程代表小明和小红
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小红").start();


        // 3.创建3个存钱线程代表: 亲爹 干爹 岳父
        new DepositThread(acc, "亲爹").start();
        new DepositThread(acc, "干爹").start();
        new DepositThread(acc, "岳父").start();

    }
}
