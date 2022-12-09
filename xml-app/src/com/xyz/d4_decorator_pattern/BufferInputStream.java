package com.xyz.d4_decorator_pattern;

import java.util.Arrays;

public class BufferInputStream extends InputStream {
    /*
    装饰类: 继承InputStream 拓展原始类的功能
     */
    private InputStream is;

    public BufferInputStream(InputStream is) {
        this.is = is;
    }

    @Override
    public int read() {
        System.out.println("提供8KB的缓冲区,提高数据性能~~");
        return is.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8KB的缓冲区,提高数据性能~~");
        return is.read(buffer);
    }
}
