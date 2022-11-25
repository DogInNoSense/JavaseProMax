package com.xyz.d8_socket3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 开发Socket网络编程入门代码的服务端,实现接收消息
 */
public class ServerDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("===========服务端启动成功==========");
            ServerSocket serverSocket = new ServerSocket(7777);
            // 1.注册端口
            while (true) {
                // 必须调用accept方法 等待接收客户端的Socket连接请求,建立Socket通信管道
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了!");
                // 每接收到一个客户端的socket管道,交给一个独立的子线程负责读取消息
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
