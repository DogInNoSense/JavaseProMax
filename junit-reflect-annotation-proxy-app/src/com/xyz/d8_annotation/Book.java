package com.xyz.d8_annotation;

public @interface Book {
    String value();

    double price() default 9.9;
}
