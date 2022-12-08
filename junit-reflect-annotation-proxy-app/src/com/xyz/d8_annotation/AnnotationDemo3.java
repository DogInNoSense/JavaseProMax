package com.xyz.d8_annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationDemo3 {
    @Test
    public void parseClass() throws Exception {
        // a.先得到类对象
        Class c = BookStore.class;
        Method m = c.getDeclaredMethod("test");
        // b.判断这个类上是否存在这个注解
        if (m.isAnnotationPresent(Book1.class)) {
            // c.直接获取该注解对象
            Book1 book = (Book1) m.getDeclaredAnnotation(Book1.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }

    @Book1(value = "情深深雨濛濛", price = 99.9, author = {"琼瑶", "author"})
    class BookStore {

        @Book1(value = "水浒传", price = 199.9, author = {"施耐庵", "罗贯中"})
        public void test() {

        }
    }

}
