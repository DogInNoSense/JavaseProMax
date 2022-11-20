package com.xyz.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 发送端 多发多收
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("==============发送端启动============");
        // 1.创建发送端对象 发送端自带默认的端口号
        DatagramSocket socket = new DatagramSocket();

        // 2.创建一个数据包对象封装数据
        /**
         public DatagramPacket(byte buf[], int length,
         InetAddress address, int port)
         参数1: 封装要发送的数据
         参数2: 数据的大小
         参数3:服务端的ip地址
         参数4: 服务端的端口
         */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说:");
            String msg = sc.nextLine();

            if ("exit".equals(msg)) {
                System.out.println("离线成功!");
                socket.close();
                break;
            }
            byte[] buffer = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);

            // 3.发送数据出去
            socket.send(packet);
        }


    }
}
