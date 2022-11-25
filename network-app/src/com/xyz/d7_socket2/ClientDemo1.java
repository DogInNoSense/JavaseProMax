package com.xyz.d7_socket2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * socket 网络编程入门案例的客户端开发,实现多发多收
 */
public class ClientDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("============客户端启动成功=============");
            Scanner sc = new Scanner(System.in);
            Socket socket = new Socket("127.0.0.1", 7777);
            // 从socket通信管道中得到一个字节输出流 负责发送数据
            OutputStream os = socket.getOutputStream();

            // 把低级的字节流包装成打印流
            PrintStream ps = new PrintStream(os);

            // 发送消息
            while (true) {
                System.out.println("请说:");
                String msg = sc.nextLine();
                if (msg.equals("exit")) {
                    break;
                } else {
                    ps.println(msg);
                    ps.flush();
                }
            }


//            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
