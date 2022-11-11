package com.xyz.d4_byte_stream;


import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个文件字节输入流管道与源文件接通
//        InputStream is = new FileInputStream(new File("file-io-app/src/data.txt"));
        // 简化写法
        InputStream is = new FileInputStream("file-io-app/src/data.txt");


        // 2.读取一个字节返回(每次读取一滴水)
//        int b1 = is.read();
//        System.out.println((char) b1);
//
//        int b2 = is.read();
//        System.out.println((char) b2);
//
//        int b3 = is.read();
//        System.out.println((char) b3);
//
//        int b4 = is.read();
//        System.out.println(b4); // 读取完毕返回-1


        // 3. 使用循环改进

        int b;
        while ((b = is.read()) != -1) {
            System.out.println((char) b);
        }
    }
}
