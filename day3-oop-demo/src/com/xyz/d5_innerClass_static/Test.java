package com.xyz.d5_innerClass_static;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.setName("xyz");
        in.show();
    }
}
