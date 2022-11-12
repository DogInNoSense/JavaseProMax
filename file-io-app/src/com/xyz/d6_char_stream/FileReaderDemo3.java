package com.xyz.d6_char_stream;

import java.io.FileWriter;
import java.io.Writer;

public class FileReaderDemo3 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个字符输出流管道与目标文件接通
//        Writer fw = new FileWriter("file-io-app/src/data5.txt"); // 覆盖管道,每次启动都会清空之前的数据
        Writer fw = new FileWriter("file-io-app/src/data5.txt", true); // 追加

        //
        fw.write(98);
        fw.write('a');
        fw.write('徐');
        fw.write("\r\n");  // 换行

        fw.write("abc我是中国人");
        fw.write("\r\n");  // 换行

        char[] chars = "abc我是中国人".toCharArray();
        fw.write(chars);
        fw.write("\r\n");  // 换行

        fw.write("abc我是中国人", 0, 3);
        fw.write("\r\n");  // 换行

        fw.write(chars, 3, 5);
        fw.write("\r\n");  // 换行

        fw.flush(); // 刷新后流可以继续使用
        fw.close(); // 关闭包含刷新,关闭后流不能使用

    }
}
