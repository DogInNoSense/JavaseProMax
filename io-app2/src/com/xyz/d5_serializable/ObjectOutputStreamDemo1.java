package com.xyz.d5_serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 对象序列化,使用ObjectOutputStream把内存中的对象存入到磁盘文件中
 */
public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 1.创建学生对象
        Student s = new Student("陈磊", "chenlei", "13141314", 13);


        // 2.对象序列化,使用对象字符输出流包装字节输出流管道
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io-app2/src/obj.txt"));


        // 3.直接调用序列化方法
        oos.writeObject(s);

        // 4.释放资源
        oos.close();
        System.out.println("序列化完成了!");
    }
}
