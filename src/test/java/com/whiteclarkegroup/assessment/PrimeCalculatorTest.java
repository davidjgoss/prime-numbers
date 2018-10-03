package com.whiteclarkegroup.assessment;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class PrimeCalculatorTest {
    @Test
    public void should_return_false_for_4() {
        assertFalse(new PrimeCalculator().isItPrime("4"));
    }
}
