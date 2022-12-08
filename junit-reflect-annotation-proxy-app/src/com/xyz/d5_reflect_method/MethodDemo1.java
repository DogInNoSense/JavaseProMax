package com.xyz.d5_reflect_method;

import org.junit.Test;

import java.lang.reflect.Method;

public class MethodDemo1 {

    @Test
    public void getDeclaredMethods() {
        Class c = Dog.class;

        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName() + "返回值类型" + method.getReturnType() + "参数个数" + method.getParameterCount());
        }
    }

    @Test
    public void getDeclaredMethod() throws Exception {
        Class c = Dog.class;

        Method method = c.getDeclaredMethod("eat");
        Method method2 = c.getDeclaredMethod("eat", String.class);

        method.setAccessible(true);
        method2.setAccessible(true);


        Dog d = new Dog();
        // 方法如果是没有结果回来的  那么返回的是null
        Object result = method.invoke(d);
        System.out.println(result);

        Object result2 = method2.invoke(d, "骨头");
        System.out.println(result2);

    }


}
