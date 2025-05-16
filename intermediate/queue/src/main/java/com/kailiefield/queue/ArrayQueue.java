package com.kailiefield.queue;

import java.util.NoSuchElementException;
import java.util.Arrays;

public class ArrayQueue<T> implements QueueInterface<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private T[] queue;
    private int front;
    private int rear;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        queue = (T[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public void enqueue(T element){
        if (size == queue.length) {
            expandCapacity();
        }
        queue[rear] = element;
        rear = (rear + 1) % queue.length;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        T result = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return result;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        T[] newQueue = (T[]) new Object[queue.length * 2];
        for (int i = 0; i < queue.length; i++) {
            newQueue[i] = queue[(front + 1) % queue.length];
        }
        queue = newQueue;
        front = 0;
        rear = size;
    }

}
