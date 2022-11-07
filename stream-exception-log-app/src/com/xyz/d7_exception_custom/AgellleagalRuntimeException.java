package com.xyz.d7_exception_custom;

// 自定义的编译异常
// 1.继承RuntimeException
// 2.重写构造器
public class AgellleagalRuntimeException extends RuntimeException {
    public AgellleagalRuntimeException() {
    }

    public AgellleagalRuntimeException(String message) {
        super(message);
    }

}
