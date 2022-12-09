package com.xyz.d3_factory_pattern;

public class Mac extends Computer {
    @Override
    public void start() {
        System.out.println(getName() + "电脑启动,显示了一个苹果图标");
    }
}
