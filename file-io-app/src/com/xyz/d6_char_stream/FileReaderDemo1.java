package com.xyz.d6_char_stream;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) throws Exception {
        // 每次读取一个  字符
        // 1.创建一个字符输入流与源文件接通
        Reader fr = new FileReader("file-io-app/src/data3.txt");

        // 2.读取一个字符返回,没有可读的字符了返回-1
//        int code = fr.read();
//        System.out.println((char) code);

        // 3.循环读取字符

        int code;
        while ((code = fr.read()) != -1) {
            System.out.print((char) code); // 不换行
        }
    }
}
