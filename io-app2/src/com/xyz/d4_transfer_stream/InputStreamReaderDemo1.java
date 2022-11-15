package com.xyz.d4_transfer_stream;

import java.io.*;

public class InputStreamReaderDemo1 {
    public static void main(String[] args) throws Exception {
        // 代码UTF-8 文件 GBK "io-app2/src/data7.txt"
        // 1.提取GBK文件的原始字节流
        InputStream is = new FileInputStream("io-app2/src/data7.txt");

        // 2.把原始字节流转换成字符输入流
//        Reader isr = new InputStreamReader(is); // 默认以UTF-8的方式转换成字符流,还是会乱码
        Reader isr = new InputStreamReader(is, "GBK");
        BufferedReader br = new BufferedReader(isr); // 以指定的GBK编码转换成字符流
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
