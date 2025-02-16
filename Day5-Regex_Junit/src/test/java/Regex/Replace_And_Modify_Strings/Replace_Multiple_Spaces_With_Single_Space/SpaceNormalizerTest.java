package Regex.Replace_And_Modify_Strings.Replace_Multiple_Spaces_With_Single_Space;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpaceNormalizerTest
{
    public String normalizeSpaces(String text)
    {
        return text.replaceAll("\\s+", " ");
    }

    @Test
    public void testMultipleSpaces()
    {
        assertEquals("This is an example with multiple spaces.",
                normalizeSpaces("This   is  an   example    with  multiple    spaces."));
    }
}
