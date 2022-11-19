package com.xyz.d8_threadpool;

import java.util.concurrent.*;

/**
 * 自定义一个线程类对象,并测试特性
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        // 1.创建线程池对象
        /**
         *  public ThreadPoolExecutor(int corePoolSize,
         *                               int maximumPoolSize,
         *                               long keepAliveTime,
         *                               TimeUnit unit,
         *                               BlockingQueue<Runnable> workQueue,
         *                               ThreadFactory threadFactory,
         *                               RejectedExecutionHandler handler)
         */
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());


        // 2.给任务线程池处理
        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        // 创建临时线程
        pool.execute(target);
        pool.execute(target);

        // 不创建,拒绝策略触发
        pool.execute(target);


        // 关闭线程池(开发一般不会使用)
        pool.shutdownNow(); // 立即关闭,即使任务没有完成,丢失任务

    }
}
