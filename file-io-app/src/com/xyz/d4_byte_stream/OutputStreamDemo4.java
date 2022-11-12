package com.xyz.d4_byte_stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo4 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个文件字节输出流与文件接通
        OutputStream os = new FileOutputStream("file-io-app/src/out4.txt"); // 先清空之前的数据,写新数据进入
//        OutputStream os = new FileOutputStream("file-io-app/src/out4.txt", true); // 追加数据
        // 2.写数据出去
        os.write('a');
        os.write(98);
        os.write("\r\n".getBytes()); // 换行,兼容性更强
        // os.write('李');
        byte[] buffer = {'a', 97, 98, 99};
        os.write(buffer);


        byte[] buffer2 = "我是中国人".getBytes();
        os.write(buffer2);


        byte[] buffer3 = {'a', 97, 98, 99};
        os.write(buffer3, 0, 3);


        // 写数据必须刷新数据
//        os.flush();
        os.close(); // 释放资源,包含了刷新的 关闭流后不可以使用了
    }
}
