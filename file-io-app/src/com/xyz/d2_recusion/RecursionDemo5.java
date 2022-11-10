package com.xyz.d2_recusion;

import java.io.File;
import java.io.IOException;

/*
文件搜索
 */
public class RecursionDemo5 {
    public static void main(String[] args) {
        // 去D盘判断搜索 123.txt文件
        // 传入目录和文件名称
        //伪代码
        long startTime = System.currentTimeMillis();   //获取开始时间
        searchFile(new File("F:/"), "QQ.exe");
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： " + (endTime - startTime) / 1000 + "s");
    }

    /**
     * 搜索某个目录下的全部文件,找到想要的文件
     *
     * @param f 被搜索的源目录
     *          fileName 文件名称
     */
    public static void searchFile(File f, String fileName) {
        // 3.判断f是否是目录
        if (f != null && f.isDirectory()) {
            // 可以找了
            // 4. 提取当前目录下的一级文件对象
            File[] files = f.listFiles();  // null
            // 5. 判断是否存在一级文件对象,存在才可以遍历
            if (files != null && files.length > 0) {
                for (File file : files) {
                    // 6.判断当前遍历的文件对象是文件还是目录
                    if (file.isFile()) {
                        // 7.是不是要找的文件,是的话把路径输出即可
                        if (file.getName().contains(fileName)) {
                            System.out.println("找到了:" + file.getAbsolutePath());
                            // 启动它
                            try {
                                Runtime r = Runtime.getRuntime();
                                r.exec(file.getAbsolutePath());  // 启动程序
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        // 8.说明是文件夹,继续递归
                        searchFile(file, fileName);
                    }
                }
            }
        } else {
            System.out.println("当前的搜索不是文件夹,不支持");
        }
    }
}
