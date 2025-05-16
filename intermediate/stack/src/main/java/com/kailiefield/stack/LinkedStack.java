package com.kailiefield.stack;

import java.util.EmptyStackException;

public class LinkedStack<T> implements StackInterface<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;
    private int size;

    @Override
    public void push(T element) {
        Node<T> node = new Node<>(element);
        node.next = top;
        top = node;
        size++;
    }

    @Override
    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    @Override
    public T peek() {
        if(isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }
}
