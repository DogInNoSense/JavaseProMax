package com.xyz.d6_socket1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * socket 网络编程入门案例的客户端开发,实现1发1收
 */
public class ClientDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("============客户端启动成功=============");
            Socket socket = new Socket("127.0.0.1", 7777);
            // 从socket通信管道中得到一个字节输出流 负责发送数据
            OutputStream os = socket.getOutputStream();

            // 把低级的字节流包装成打印流
            PrintStream ps = new PrintStream(os);

            // 发送消息

            ps.println("我是一条消息");
            ps.flush();


//            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
