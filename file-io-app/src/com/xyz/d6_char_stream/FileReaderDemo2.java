package com.xyz.d6_char_stream;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo2 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个文件字符输入流与源文件接通
        Reader fr = new FileReader("file-io-app/src/data3.txt");

        // 2.用循环每次读取一个字符数组的数据
        char buffer[] = new char[1024];
        int len;
        while ((len = fr.read(buffer)) != -1) {
            String rs = new String(buffer, 0, len);
            System.out.print(rs);
        }
    }
}
