package com.xyz.d3_factory_pattern;

public class Huawei extends Computer {
    @Override
    public void start() {
        System.out.println(getName() + "电脑启动,显示华为图标");
    }
}
