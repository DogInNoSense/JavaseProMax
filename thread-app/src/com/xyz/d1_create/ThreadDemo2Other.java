package com.xyz.d1_create;

public class ThreadDemo2Other {
    public static void main(String[] args) {
        // 1.创建一个任务对象
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程执行输出:" + i);
                }
            }
        };
        // 4.把任务对象交给Thread处理
        Thread t = new Thread(target);

        // 5.启动线程

        t.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程执行输出:" + i);
                }
            }
        });
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出:" + i);
        }
    }
}
