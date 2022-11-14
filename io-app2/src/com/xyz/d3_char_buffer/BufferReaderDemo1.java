package com.xyz.d3_char_buffer;

/*
使用缓冲字符输入流提高字符输入流的性能,新增了按照行读取的方法
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferReaderDemo1 {
    public static void main(String[] args) {
        try (
                // 1.创建一个文件字符输入流与源文件接通
                Reader fr = new FileReader("io-app2/src/data5.txt");
                // a.把低级的字符输入流包装成高级的缓冲字符输入流
                BufferedReader br = new BufferedReader(fr);

        ) {
            // 2.循环读取一个字符数组的数据
//            char[] buffer = new char[1024];
//            int len;
//            while ((len = br.read(buffer)) != -1) {
//                String rs = new String(buffer, 0, len);
//                System.out.println(rs);
//            }
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}