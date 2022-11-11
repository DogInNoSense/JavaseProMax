package com.xyz.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

// s使用文件字节流输入流一次读完文件的全部字节,可以解决乱码问题
public class FileInputStreamDemo3 {
    public static void main(String[] args) throws Exception {
        File f = new File("file-io-app/src/data3.txt");

        // 1.创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream(f);

        // 2.定义一个字节数组与文件的大小刚好一样大

//        byte[] buffer = new byte[(int) f.length()];

//        int len = is.read(buffer);
//        System.out.println("读取了: " + len + "个字节");
//        System.out.println("文件大小: " + f.length());
//        String rs = new String(buffer);
//        System.out.println(rs);


        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));

    }
}
