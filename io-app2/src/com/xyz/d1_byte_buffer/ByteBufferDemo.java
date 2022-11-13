package com.xyz.d1_byte_buffer;


import java.io.*;

// 使用字节缓冲流完成数据的读写操作
public class ByteBufferDemo {
    public static void main(String[] args) {
        try {
            // 1.创建一个字节输入流与原视频接通
            InputStream is = new FileInputStream("E:\\videos\\Youtube下载\\政治类\\【 志祺七七 】六四天安門事件 30 週年！當年中國竟然差點就變成一個民主國家了？《 左邊鄰居觀察日記 》EP010.mp4");
            // a.把原始的字节输入流包装成高级的缓冲字节输入流
            InputStream bis = new BufferedInputStream(is);

            // 2.创建一个字节输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("E:/videos/new.mp4");
            OutputStream bos = new BufferedOutputStream(os);

            // 3.定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成了!");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
