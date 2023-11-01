package org.example.homeWork.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator unit = new Calculator();

    @Test
        //1
    void addTest() {
        int a = 5;
        int b = 5;
        int sum = 10;
        Assertions.assertEquals(sum, unit.add(a, b));
    }

    @Test
        //2
    void subtractTest() {
        int a = 10;
        int b = 10;
        int substract = 0;
        Assertions.assertEquals(substract, unit.subtract(a, b));
    }

    @Test
        //3
    void multiplyTest() {
        int a = 2;
        int b = 2;
        int multiSum = 4;
        Assertions.assertEquals(multiSum, unit.multiply(a, b));
    }

    @Test
        //4
    void divideTestPiziv() {
        int a = 10;
        int b = 10;
        int expected = 1;
        Assertions.assertEquals(expected, unit.c(a, b));
    }

    @Test
    void divideNegativTest() {
        int a = 10;
        int b = 0;
        assertThrows(ArithmeticException.class, () -> unit.c(a, b));
    }

    @Test
        //5
    void powerTest() {
        double base = 2;
        double extetet = 3;
        double expected = 8;
        Assertions.assertEquals(expected, unit.power(base, extetet));
    }

    @Test
    void powerZeroTest() {
        double base = 5;
        double expectet = 0;
        double expected = 1;
        double result = unit.power(base, expectet);
        Assertions.assertEquals(expected, result);
    }

    @Test //6
    public void factorialWithPositiveNumberTest() {
        int n = 5;
        long extend = 120;
        long result = (int) unit.factorial(n);
        Assertions.assertEquals(extend, result);
    }

    @Test
    public void factorialNegativNumberTest() {
        int n = -5;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            unit.factorial(n);
        });
    }

    @Test //7
    public void isEvenPozitivTest() {
        int n = 2;
        Assertions.assertTrue(unit.isEven(n));
    }

    @Test
    public void isEvenNegativTest() {
        int n = -3;
        Assertions.assertFalse(unit.isEven(n));
    }
}