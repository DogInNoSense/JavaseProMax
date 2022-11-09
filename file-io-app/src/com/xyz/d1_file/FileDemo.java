package com.xyz.d1_file;

import java.io.File;

public class FileDemo {
    // 创建File对象定位操作系统的文件(文件 文件夹的)
    public static void main(String[] args) {
        // 1.常见File对象(指定了文件的路径)
        // 三种路径写法
//        File f = new File("F:\\图片\\壁纸\\sunset-dusk-crescent-moon-tree-scenery-4k-wallpaper-uhdpaper.com-660@0@e.jpg");
//        File f = new File("F:/图片/壁纸/sunset-dusk-crescent-moon-tree-scenery-4k-wallpaper-uhdpaper.com-660@0@e.jpg");
        File f = new File("F:" + File.separator + "图片" + File.separator + "壁纸" + File.separator + "sunset-dusk-crescent-moon-tree-scenery-4k-wallpaper-uhdpaper.com-660@0@e.jpg");
        long size = f.length(); // 文件的字节大小
        System.out.println(size);

        // 2.File创建对象 支持绝对路径 也支持相对路径(重点)
        File f1 = new File("F:/图片/壁纸/sunset-dusk-crescent-moon-tree-scenery-4k-wallpaper-uhdpaper.com-660@0@e.jpg");
        // 绝对路径
        System.out.println(f1.length());

        // 定位模块中的文件 (相对到工程下) JavaProMax下面
        File f2 = new File("file-io-app/src/data.txt");
        System.out.println(f2.length());


        // 3.File创建对象,可以是文件也可以是文件及
        File f3 = new File("F:/图片");
        System.out.println(f3.exists());
        // 文件夹存在
    }
}