package com.xyz.d4_transfer_stream;

import java.io.*;

/**
 * 指定写数据的字符编码
 */
public class OutputStreamWriterDemo2 {
    public static void main(String[] args) throws Exception {
        // 1.定义一个字节输出流
        OutputStream os = new FileOutputStream("io-app2/src/out1.txt");


        // 2.把原始的字节输出流转换成字符输出流
//        Writer isw = new OutputStreamWriter(os); // 以默认的UTF-8写字符出去
        Writer osw = new OutputStreamWriter(os, "GBK"); // 指定GBK的方式写字符出去

        // 3.把低级的字符输出流包装成高级的缓冲字符输出流

        BufferedWriter bw = new BufferedWriter(osw);


        bw.write("我爱中国1");
        bw.write("我爱中国2");
        bw.write("我爱中国3");

        bw.close();

    }
}
