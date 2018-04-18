package com.patrickpu.test.functionalInterface;

@FunctionalInterface
public interface Tranformer<T> {
    public T transform(T t);
}
