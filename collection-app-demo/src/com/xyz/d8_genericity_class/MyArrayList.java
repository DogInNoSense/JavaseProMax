package com.xyz.d8_genericity_class;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> {
    private ArrayList lists = new ArrayList();

    // 泛型设计
    public void add(E e) {
        lists.add(e);
    }

    public void remove(E e) {
        lists.remove(e);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}
