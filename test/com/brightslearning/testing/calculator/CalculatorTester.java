package com.brightslearning.testing.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTester {

    @Test
    public void should_addTwoNumbers() {
        Calculator calculator = new CalculatorImpl();

        assertEquals(3, calculator.plus(1, 2));
        assertEquals(10, calculator.plus(5, 5));
    }
}
