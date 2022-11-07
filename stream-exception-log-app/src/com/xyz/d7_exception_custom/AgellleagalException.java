package com.xyz.d7_exception_custom;

// 1.自定义的编译异常
// 2.重写构造器
public class AgellleagalException extends Exception {
    public AgellleagalException() {
    }

    public AgellleagalException(String message) {
        super(message);
    }

}
