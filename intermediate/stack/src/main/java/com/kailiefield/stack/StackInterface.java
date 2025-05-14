package com.kailiefield.stack;

public interface StackInterface<T> {

    void push(T element);     //<--- add to top

    T pop();                 //<-- remove from top

    T peek();               //<-- look at the top

    boolean isEmpty();     //<-- is the stack empty?

    int size();           //<-- how many items?
}
