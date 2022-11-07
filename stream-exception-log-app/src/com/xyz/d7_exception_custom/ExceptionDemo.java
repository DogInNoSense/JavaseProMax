package com.xyz.d7_exception_custom;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            checkAge(10000);
        } catch (AgellleagalException e) {
            e.printStackTrace();
        }
    }

    public static void checkAge(int age) throws AgellleagalException {
        if (age < 0 || age > 200) {
            // throw 在方法内部直接创建一个异常对象,并从此点抛出
            // throws 用在方法申明上的,抛出方法的异常
            throw new AgellleagalException(age + " 是非法数据");

        } else {
            System.out.println("年龄合法,可以购买");
        }
    }
}
