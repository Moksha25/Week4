package JUnit.Advanced_JUnit.Testing_Date_Formatter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateFormatterTest
{
    @Test
    void testValidDateFormatting() {
        assertEquals("15-08-2023", DateFormatter.formatDate("2023-08-15"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
        assertEquals("29-02-2020", DateFormatter.formatDate("2020-02-29")); // Leap year case
    }

    @Test
    void testInvalidDateFormatting() {
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("15-08-2023"), "Should throw exception for dd-MM-yyyy format");
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("2023/08/15"), "Should throw exception for incorrect separators");
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("2023-13-01"), "Should throw exception for invalid month");
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("2023-02-30"), "Should throw exception for invalid day");
    }
}
