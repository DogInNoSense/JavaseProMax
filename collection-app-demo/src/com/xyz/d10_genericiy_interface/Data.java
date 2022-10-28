package com.xyz.d10_genericiy_interface;

public interface Data<E> {
    void add(E e);

    void Delete(int id);

    void update(E e);

    E queryById(int id);
}
