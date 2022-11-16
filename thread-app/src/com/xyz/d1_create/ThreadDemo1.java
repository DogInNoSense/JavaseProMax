package com.xyz.d1_create;

/**
 * 多线程的创建方式1: 继承Thread类实现
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        // 3. new一个新线程对象
        Thread t = new MyThread();
        // 4. 调用start方法启动线程(执行的还是run方法)
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出" + i);
        }

    }
}

/**
 * 定义一个线程类继承Thread类
 */
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出" + i);
        }
    }
}

