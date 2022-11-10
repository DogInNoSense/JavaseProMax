package com.xyz.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;

public class FileDemo2 {
    public static void main(String[] args) {
        // 1.绝对路径创建一个文件夹
        File f1 = new File("F:/图片/壁纸/sunset-dusk-crescent-moon-tree-scenery-4k-wallpaper-uhdpaper.com-660@0@e.jpg");
        // a.获取它的绝对路径
        System.out.println(f1.getAbsolutePath());
        // b.获取文件定义的时候用的路径
        System.out.println(f1.getPath());
        // c.获取文件的名称 :带后缀
        System.out.println(f1.getName());
        // d.获取文件的大小: 字节个数
        System.out.println(f1.length());
        // e.获取文件的最后修改时间
        System.out.println(f1.lastModified());
        // 格式化
        System.out.println("最后修改时间:" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(f1.lastModified()));

        // f.判断是文件还是文件夹
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());

        System.out.println("------------------------------------------");
        File f2 = new File("file-io-app\\src\\data.txt");
        // a.获取它的绝对路径
        System.out.println(f2.getAbsolutePath());
        // b.获取文件定义的时候用的路径
        System.out.println(f2.getPath());
        // c.获取文件的名称 :带后缀
        System.out.println(f2.getName());
        // d.获取文件的大小: 字节个数
        System.out.println(f2.length());
        // e.获取文件的最后修改时间
        System.out.println(f2.lastModified());
        // 格式化
        System.out.println("最后修改时间:" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(f2.lastModified()));

        // f.判断是文件还是文件夹
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());


        File file = new File("D:/");
        System.out.println(file.isFile()); // false
        System.out.println(file.isDirectory()); // true

    }
}
