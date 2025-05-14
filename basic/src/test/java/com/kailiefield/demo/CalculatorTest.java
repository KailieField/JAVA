package com.kailiefield.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {

        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testMultiplication() {

        assertEquals(12, calculator.multiply(3, 4));
    }
}
