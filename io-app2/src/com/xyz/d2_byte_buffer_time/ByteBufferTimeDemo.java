package com.xyz.d2_byte_buffer_time;

import java.io.*;

public class ByteBufferTimeDemo {
    private static final String SRC_FILE = "E:\\test\\1.mp4";
    private static final String DEST_FILE = "E:\\course";

    public static void main(String[] args) {
//        copy01();  // 使用低级的字节流按照一个一个字节的形式复制文件: 慢的让人无法忍受,直接被淘汰
        copy02();  // 使用低级的字节流一个一个字节数组的形式复制文件: 比较慢
//        copy03();  // 缓冲流一个一个字节复制: 很慢
        copy04();  // 缓冲流一个一个字节数组复制: 很快(推荐使用)
    }


    private static void copy04() {
        long startTime = System.currentTimeMillis();
        try ( // 1.创建低级的字节输入流与源文件接通
              InputStream is = new FileInputStream(SRC_FILE);
              // 2.创建低级的字节输出流与目标文件相通
              InputStream bis = new BufferedInputStream(is);
              OutputStream os = new FileOutputStream(DEST_FILE + "video4.mp4");
              OutputStream bos = new BufferedOutputStream(os);
        ) {
            // 3.定义一个字节数组转移数据
            byte[] buffer = new byte[1024 * 8];
            int len; // 记录每次读取的字节数
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy4  " + (endTime - startTime) / 1000 + "秒");
    }

    private static void copy03() {
        long startTime = System.currentTimeMillis();
        try (
                // 1.创建低级的字节输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                // 2.创建低级的字节输出流与目标文件相通
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DEST_FILE + "video3.mp4");
                OutputStream bos = new BufferedOutputStream(os);
        ) {

            // 定义一个变量记录每次读取的字节(一个一个字节的复制)
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy3  " + (endTime - startTime) / 1000 + "秒");
    }

    private static void copy02() {
        long startTime = System.currentTimeMillis();
        try ( // 1.创建一个字节输入流与原视频接通
              InputStream is = new FileInputStream(SRC_FILE);
              // a.把原始的字节输入流包装成高级的缓冲字节输入流
              OutputStream os = new FileOutputStream(DEST_FILE + "video2.mp4");
        ) {
            // 3.定义一个字节数组转移数据
            byte[] buffer = new byte[1024 * 8];
            int len; // 记录每次读取的字节数
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy2  " + (endTime - startTime) / 1000 + "秒");
    }


    /*
    使用低级的字节流按照一个一个字节的形式复制文件
     */
    private static void copy01() {
        long startTime = System.currentTimeMillis();
        try (
                // 1.创建低级的字节输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                // 2.创建低级的字节输出流与目标文件相通
                OutputStream os = new FileOutputStream(DEST_FILE + "video1.mp4");
        ) {
            // 定义一个变量记录每次读取的字节(一个一个字节的复制)
            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy1  " + (endTime - startTime) / 1000 + "秒");
    }
}
