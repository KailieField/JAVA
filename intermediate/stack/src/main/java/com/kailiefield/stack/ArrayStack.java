package com.kailiefield.stack;

import java.util.Arrays;
import java.util.EmptyStackException;


public class ArrayStack<T> implements StackInterface<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private T[] stack;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        stack = (T[]) new Object[DEFAULT_CAPACITY];
        top = 0;
    }

    @Override
    public void push(T element) {
        if (top == stack.length) {
            expandCapacity();
        }
        stack[top++] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T result = stack[--top];
        stack[top] = null;
        return result;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return stack[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size(){
        return top;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }


}
