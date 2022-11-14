package com.xyz.d3_char_buffer;

/*
缓冲字符输出流的使用,学会它多出来的一个功能 : newLine();
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferReaderDemo2 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个字符输出流管道与目标文件接通
//        Writer bw = new FileWriter("file-io-app/src/data5.txt"); // 覆盖管道,每次启动都会清空之前的数据
        Writer fw = new FileWriter("io-app2/src/data6.txt", true); // 追加

        BufferedWriter bw = new BufferedWriter(fw);
        //
        bw.write(98);
        bw.write('a');
        bw.write('徐');
        bw.newLine();  // 换行

        bw.write("abc我是中国人");
        bw.write("\r\n");  // 换行

        char[] chars = "abc我是中国人".toCharArray();
        bw.write(chars);
       bw.newLine();  // 换行

        bw.write("abc我是中国人", 0, 3);
        bw.write("\r\n");  // 换行

        bw.write(chars, 3, 5);
        bw.newLine();  // 换行

        bw.flush(); // 刷新后流可以继续使用
        bw.close(); // 关闭包含刷新,关闭后流不能使用

    }
}