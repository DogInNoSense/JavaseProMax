package com.xyz.d3_charset;


import java.util.Arrays;

/*
进行文字的编码和解码
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 1.编码: 把文字转换成字节(使用指定的编码)
        String name = "abc我爱你中国";  // 18个字节
        byte[] bytes = name.getBytes();  // 以当前代码默认字符集进行编码 (UTF-8)
//        byte[] bytes = name.getBytes("GBK");  // 指定编码
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes)); // 英文为正数,中文为负数


        // 把字节转换为相应的中文形式(编码前和编码后的字符集必须一致,否则乱码)
        String rs = new String(bytes);
//        String rs = new String(bytes, "GBK"); // 指定解码
        System.out.println(rs);
    }
}
