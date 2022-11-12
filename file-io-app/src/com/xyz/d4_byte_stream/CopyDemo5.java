package com.xyz.d4_byte_stream;

import java.io.*;

// 使用字节流完成文件的复制(支持一切文件类型(视频,图片,文本等)的复制)
public class CopyDemo5 {
    public static void main(String[] args) {
        try {
            // 1.创建一个字节输入流与原视频接通
            InputStream is = new FileInputStream("E:\\videos\\Youtube下载\\政治类\\【 志祺七七 】六四天安門事件 30 週年！當年中國竟然差點就變成一個民主國家了？《 左邊鄰居觀察日記 》EP010.mp4");


            // 2.创建一个字节输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("E:/videos/new.mp4");


            // 3.定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成了!");

            // 4.关闭流
            os.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
