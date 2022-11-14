package com.xyz.d3_char_buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 完成出师表顺序的恢复,并存入到另一个新文件中去
 */
public class BufferCharTest3 {
    public static void main(String[] args) {
        // 1.创建缓冲字符输入流与源文件接入
        try (
                BufferedReader br = new BufferedReader(new FileReader("io-app2/src/csb.txt"));
                // 5.定义缓冲字符输出管道与目标文件接通
                BufferedWriter bw = new BufferedWriter(new FileWriter("io-app2/src/new.txt"));) {

            // 2.定义一个List集合存储每行内容
            List<String> data = new ArrayList<>();
            // 3.循环按照行读取文章
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            System.out.println(data);


            // 4.排序
            // 自定义排序规则
            List<String> sizes = new ArrayList<>();
//            Collections.sort(data);
            Collections.addAll(sizes, "一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一");

            // 文本中如果有空行则比较会出错
            Collections.sort(data, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return sizes.indexOf(o1.substring(0, o1.indexOf(".")))
                            - sizes.indexOf(o2.substring(0, o2.indexOf(".")));
                }
            });
            System.out.println(data);


            // 6.遍历集合中每行
            for (String datum : data) {
                bw.write(datum);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
