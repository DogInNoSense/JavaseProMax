package com.xyz.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接受端
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("===========服务端启动============="); // 先启动服务端
        // 1.创建接收端对象: 注册端口
        DatagramSocket socket = new DatagramSocket(7777);

        // 2.创建数据包对象
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            // 3.等待接收数据即可
            socket.receive(packet);

            // 4.取出数据
            // 读取多少取多少
            int len = packet.getLength();
            String rs = new String(buffer, 0, len);
            System.out.println("收到了:" + rs);
            System.out.println("收到了来自:" + packet.getAddress() + ",对方端口是" + packet.getPort() + "消息是:" + rs);

        }


    }
}
