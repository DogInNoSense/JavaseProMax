package com.xyz.d5_resource;

import java.io.*;

// 使用finally释放资源
public class TryCatchFinallyDemo1 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            // 1.创建一个字节输入流与原视频接通
            is = new FileInputStream("E:\\videos\\Youtube下载\\政治类\\【 志祺七七 】六四天安門事件 30 週年！當年中國竟然差點就變成一個民主國家了？《 左邊鄰居觀察日記 》EP010.mp4");


            // 2.创建一个字节输出流管道与目标文件接通
            os = new FileOutputStream("E:/videos/new.mp4");


            // 3.定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成了!");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 无论代码是正常结束还是异常结束都要最后执行这里
            System.out.println("============finally==================");

            try {
                // 4.关闭流
                if (os != null) os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
