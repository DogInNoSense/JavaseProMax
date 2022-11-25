package com.xyz.d8_socket3;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * socket 实现服务器可以同时处理多个客户端的消息
 */
public class ClientDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("==========客户端启动成功===========");
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
