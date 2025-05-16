package com.kailiefield.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedStackTest {

    private StackInterface<Integer> stack;

    @BeforeEach
    void setUp(){
        stack = new LinkedStack<>();
    }

    @Test
    void testPushAndSize() {
        stack.push(100);
        stack.push(200);
        assertEquals(2, stack.size());
    }

    @Test
    void testPeek() {
        stack.push(55);
        assertEquals(55, stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    void testPop() {
        stack.push(1);
        stack.push(2);
        int popped = stack.pop();
        assertEquals(2, popped);
        assertEquals(1, stack.size());
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testPopEmptyThrows(){
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void testPeekEmptyThrows(){
        assertThrows(EmptyStackException.class, () -> stack.peek());
    }
}
