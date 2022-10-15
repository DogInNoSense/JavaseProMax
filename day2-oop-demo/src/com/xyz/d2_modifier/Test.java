package com.xyz.d2_modifier;

public class Test {
    public static void main(String[] args) {
        // 权限修饰符的修饰范围
        Fu f = new Fu();
//        f.privateMethod(); // 不能访问
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
