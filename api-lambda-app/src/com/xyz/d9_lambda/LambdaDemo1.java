package com.xyz.d9_lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 学会使用Lambda的标准格式简化匿名内部类的代码形式
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟跑的很慢");

            }
        };
        a.run();
    }
}
