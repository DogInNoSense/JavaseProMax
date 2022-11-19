package com.xyz.d8_threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用Executors直接得到一个线程对象
 */
public class ThreadDemo3 {
    public static void main(String[] args) throws Exception {
        // 1.创建固定线程数据的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable()); // 已经没有多余线程了
        pool.execute(new MyRunnable()); // 已经没有多余线程了
        pool.execute(new MyRunnable()); // 已经没有多余线程了
        pool.execute(new MyRunnable()); // 已经没有多余线程了
        pool.execute(new MyRunnable()); // 已经没有多余线程了
        pool.execute(new MyRunnable()); // 已经没有多余线程了
        pool.execute(new MyRunnable()); // 已经没有多余线程了
        pool.execute(new MyRunnable()); // 已经没有多余线程了
        pool.execute(new MyRunnable()); // 已经没有多余线程了
        pool.execute(new MyRunnable()); // 已经没有多余线程了

    }
}
