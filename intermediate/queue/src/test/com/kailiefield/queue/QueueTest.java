package com.kailiefield.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private QueueInterface<Integer> queue;

    @BeforeEach
    void setup(){
        queue = new ArrayQueue<>();
    }

    @Test
    void testEnqueueAndSize() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(3, queue.size());
    }

    @Test
    void testPeek() {
        queue.enqueue(42);
        assertEquals(42, queue.peek());
        assertEquals(1, queue.size());
    }

    @Test
    void testDequeue() {
        queue.enqueue(10);
        queue.enqueue(20);
        int dequeue = queue.dequeue();
        assertEquals(10, dequeue);
        assertEquals(1, queue.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue(99);
        assertFalse(queue.isEmpty());
    }

    @Test
    void testDequeueEmptyThrows(){
        assertThrows(NoSuchElementException.class, () -> queue.dequeue());
    }

    @Test
    void testPeekEmptyThrows(){
        assertThrows(NoSuchElementException.class, () -> queue.peek());
    }
}
