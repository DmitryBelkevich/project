package com.hard;

interface Tree<T> extends Balanced, Rotatable {
    void add(T data);

    void remove(T data);

    int size();

    void print();
}
