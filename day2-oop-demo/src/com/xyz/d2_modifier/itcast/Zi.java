package com.xyz.d2_modifier.itcast;

import com.xyz.d2_modifier.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Zi z = new Zi();
//        f.privateMethod();
//        f.method();
        z.protectedMethod();
        z.publicMethod();
    }

}
