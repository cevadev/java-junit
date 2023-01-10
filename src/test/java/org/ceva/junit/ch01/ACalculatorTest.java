package org.ceva.junit.ch01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ACalculatorTest {
    @Test
    public void testAdd(){
        ACalculator calculator = new ACalculator();
        double result = calculator.add(10,50);
        Assertions.assertEquals(60, result, 0);
    }
}
