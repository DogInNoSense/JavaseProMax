package com.xyz.d9_lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // lambda只能简化接口中只有一个抽象方法的匿名类形式
//
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("老师游泳贼6");
//            }
//        };
        Swimming s1 = () -> {
            System.out.println("老师游泳贼6");
        };
        go(s1);
    }

    public static void go(Swimming s) {
        System.out.println("开始..");
        System.out.println("结束..");

    }
}

@FunctionalInterface // 一旦加上这个注释必须是函数式接口,里面只能有一个抽象方法
interface Swimming {
    void swim();
}
