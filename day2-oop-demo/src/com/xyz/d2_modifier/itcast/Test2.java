package com.xyz.d2_modifier.itcast;

import com.xyz.d2_modifier.Fu;

public class Test2 {
    public static void main(String[] args) {
        Fu f = new Fu();
//        f.privateMethod();
//        f.method();
//        f.protectedMethod();
        // 以上不能访问
        f.publicMethod();
    }
}
