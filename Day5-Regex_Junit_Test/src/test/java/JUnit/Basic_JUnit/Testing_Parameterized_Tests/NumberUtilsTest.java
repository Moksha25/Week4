package JUnit.Basic_JUnit.Testing_Parameterized_Tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberUtilsTest
{
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testEvenNumbers(int number) {
        assertTrue(NumberUtils.isEven(number), number + " should be even.");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testOddNumbers(int number) {
        assertFalse(NumberUtils.isEven(number), number + " should be odd.");
    }
}
