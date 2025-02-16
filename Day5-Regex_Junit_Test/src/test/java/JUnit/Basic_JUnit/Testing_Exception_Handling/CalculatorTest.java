package JUnit.Basic_JUnit.Testing_Exception_Handling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest
{
    Calculator calculator = new Calculator();

    @Test
    void testDivideValidNumbers() {
        assertEquals(5, calculator.divide(10, 2));
        assertEquals(-3, calculator.divide(-9, 3));
        assertEquals(0, calculator.divide(0, 5));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });

        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
