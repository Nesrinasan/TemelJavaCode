package com.kodcu.generics;

/**
 * Generic version
 * @param <T> the type of value being boxed
 */
public class Box<T> {

    private T t; // T stands for "Type"

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
