package com.xyz.d9_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo1 {
    public static void main(String[] args) {
        // 1.创建Timer定时器
        Timer timer = new Timer();
        // 2.调用方法,处理定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行AAA" + new Date());
            }
        }, 0, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行BBB" + new Date());
            }
        }, 0, 2000);
    }

}
