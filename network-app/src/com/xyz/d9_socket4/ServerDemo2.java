package com.xyz.d9_socket4;

import com.xyz.d8_socket3.ServerReaderThread;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * 开发Socket网络编程入门代码的服务端,实现接收消息
 */
public class ServerDemo2 {
    // 使用静态变量记住一个线程池对象
    private static ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());


    public static void main(String[] args) {
        try {
            System.out.println("===========服务端启动成功==========");
            ServerSocket serverSocket = new ServerSocket(6666);
            // 1.注册端口
            while (true) {
                // 必须调用accept方法 等待接收客户端的Socket连接请求,建立Socket通信管道
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了!");
//                任务负责读取消息
                Runnable target = new ServerReaderRunnable(socket);
                pool.execute(target);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
