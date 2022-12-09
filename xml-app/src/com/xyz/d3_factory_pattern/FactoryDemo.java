package com.xyz.d3_factory_pattern;

public class FactoryDemo {
    public static void main(String[] args) {
//        Computer c = new Mac();
//        c.setName("苹果");
//        c.setPrice(9999);
//        c.start();
        Computer c1 = FactoryPattern.createComputer("huawei");

        c1.start();

        Computer c2 = FactoryPattern.createComputer("mac");

        c2.start();
    }
}
