package JUnit.Basic_JUnit.Testing_Calculator_Class;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest
{
    Calculator calculator = new Calculator();

    @Test
    void testAddition()
    {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-10, calculator.add(-5, -5));
    }

    @Test
    void testSubtraction()
    {
        assertEquals(0, calculator.subtract(5, 5));
        assertEquals(-10, calculator.subtract(-5, 5));
        assertEquals(0, calculator.subtract(-5, -5));
    }

    @Test
    void testMultiplication()
    {
        assertEquals(25, calculator.multiply(5, 5));
        assertEquals(-25, calculator.multiply(-5, 5));
        assertEquals(25, calculator.multiply(-5, -5));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void testDivision()
    {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(-2, calculator.divide(-10, 5));
        assertEquals(1, calculator.divide(-5, -5));
    }

    @Test
    void testDivisionByZero()
    {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
