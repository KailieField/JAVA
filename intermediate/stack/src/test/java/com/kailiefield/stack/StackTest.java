package com.kailiefield.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private StackInterface<Integer> stack;

    @BeforeEach
    void setUp(){
        stack = new ArrayStack<>();
    }
    @Test
    void testPushAndSize(){
        stack.push(10);
        stack.push(20);
        assertEquals(2, stack.size());
    }

    @Test
    void testPeek(){
        stack.push(42);
        assertEquals(42, stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    void testPop(){
        stack.push(1);
        stack.push(2);
        int popped = stack.pop();
        assertEquals(2, popped);
        assertEquals(1, stack.size());
    }

    @Test
    void testIsEmpty(){
        assertTrue(stack.isEmpty());
        stack.push(99);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testPopEmptyThrows(){
        assertThrows(java.util.EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void testPeekEmptyThrows(){
        assertThrows(java.util.EmptyStackException.class, () -> stack.peek());
    }
}
