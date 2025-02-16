package JUnit.Basic_JUnit.Testing_String_Utility_Methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest
{
    StringUtils stringUtils = new StringUtils();

    @Test
    void testReverse()
    {
        assertEquals("dcba", stringUtils.reverse("abcd"));
        assertEquals("olleh", stringUtils.reverse("hello"));
        assertEquals("", stringUtils.reverse(""));
        assertNull(stringUtils.reverse(null));
    }

    @Test
    void testIsPalindrome()
    {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(stringUtils.isPalindrome("racecar"));
        assertTrue(stringUtils.isPalindrome("Madam")); // Case insensitive check
        assertFalse(stringUtils.isPalindrome("hello"));
        assertFalse(stringUtils.isPalindrome(null));
    }

    @Test
    void testToUpperCase()
    {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("JAVA", stringUtils.toUpperCase("java"));
        assertEquals("TEST", stringUtils.toUpperCase("TeSt"));
        assertNull(stringUtils.toUpperCase(null));
    }
}
