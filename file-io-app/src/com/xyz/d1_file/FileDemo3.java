package com.xyz.d1_file;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f = new File("file-io-app\\src\\data.txt");
        // a.创建文件
        System.out.println(f.createNewFile());

        File f2 = new File("file-io-app\\src\\data2.txt");
        System.out.println(f2.createNewFile());  // 几乎不用

        // b.mkdir 创建一级目录
//        File f3 = new File("D:/resource/aaa");
//        System.out.println(f3.mkdir());


        // c.mkdirs 创建多级目录
        File f3 = new File("D:/resource/aaa/bbb");
        System.out.println(f3.mkdirs());
        // d.删除文件(占用一样可以删除)或者空文件夹,只能删除空文件夹
        System.out.println(f2.delete());
        File f4 = new File("D:/resource/aaa/bbb");
        System.out.println(f4.delete());

    }
}
