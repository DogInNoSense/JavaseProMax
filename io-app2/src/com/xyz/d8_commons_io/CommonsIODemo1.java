package com.xyz.d8_commons_io;
/**
 * 网址:
 * https://commons.apache.org/proper/commons-io/download_io.cgi
 */

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CommonsIODemo1 {
    public static void main(String[] args) throws Exception {
        // 1.文件复制(可以复制任何文件类型)
//        IOUtils.copy(new FileInputStream("io-app2/src/data6.txt"), new FileOutputStream("io-app2/src/commons.txt"));


        // 2.完成文件复制到某个文件夹下
//        FileUtils.copyFileToDirectory(new File("E:\\Code\\Java\\JavaseProMax\\io-app2\\src\\data6.txt"), new File("E:/"));
        // 好像只能复制到同一个文件夹下

        // 3.完成文件夹复制到某个文件夹下
        FileUtils.copyDirectoryToDirectory(new File("D:/resources"), new File("D:\\new"));

        FileUtils.deleteDirectory(new File("D:\\new")); // 删除 new 文件夹
    }
}
