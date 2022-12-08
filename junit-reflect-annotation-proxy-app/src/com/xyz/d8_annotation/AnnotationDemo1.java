package com.xyz.d8_annotation;

/**
 * 自定义注解
 */
@MyBook(name = "精通java", authors = {"黑马", "xyz"}, price = 195)
public class AnnotationDemo1 {

    @MyBook(name = "精通java", authors = {"黑马", "xyz"}, price = 195)
    private AnnotationDemo1() {

    }

    @MyBook(name = "精通java", authors = {"黑马", "xyz"}, price = 195)
    public static void main(String[] args) {

        @MyBook(name = "精通java", authors = {"黑马", "xyz"}, price = 195)
        int age = 21;
    }
}
