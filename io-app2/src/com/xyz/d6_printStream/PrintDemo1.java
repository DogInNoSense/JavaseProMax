package com.xyz.d6_printStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 使用打印流 高效 方便 写数据到文件
 * 覆盖管道
 */
public class PrintDemo1 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个打印流对象

//        PrintStream ps = new PrintStream("io-app2/src/ps.txt");
        PrintStream ps = new PrintStream(new FileOutputStream("io-app2/src/ps.txt", true)); // 追加数据


        ps.print(87);
        ps.print('a');
        ps.print(23.3);
        ps.println(true);
        ps.print("我是打印流输出,我是啥就打印啥");

        ps.close();
    }
}
