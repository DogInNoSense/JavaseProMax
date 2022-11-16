package com.xyz.d1_create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 学会线程的创建方式3:实现Callable接口,结合FutureTask完成
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        // 3.创建Callable任务对象
        Callable<String> call = new MyCallable(100);

        // 4.把callable任务对象交给 FutureTask 对象
        // FutureTask对象的作用1: 把Runable的对象(实现了Runnable接口),可以交给Thread了
        // FutureTask对象的作用2: 可以在线程执行完毕之后通过调用其get方法得到线程执行完成的结果

        // 5.交给线程学习
        FutureTask<String> f1 = new FutureTask<>(call);
        Thread t1 = new Thread(f1);

        // 6.启动线程
        t1.start();


        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> f2 = new FutureTask<>(call2);
        Thread t2 = new Thread(f2);
        t2.start();

        try {
            String rs1 = f1.get();
            System.out.println("第一个结果:" + rs1);
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            String rs2 = f2.get();
            System.out.println("第二个结果:" + rs2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

/**
 * 1.定义一个任务类 实现Callable接口   应该申明线程任务执行完毕后结果的数据类型
 */

class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    /**
     * 2.重写call方法 (线程的任务方法)
     */
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return "子线程的执行的结果是:" + sum;
    }
}