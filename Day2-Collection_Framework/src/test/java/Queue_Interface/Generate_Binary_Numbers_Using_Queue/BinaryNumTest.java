package Queue_Interface.Generate_Binary_Numbers_Using_Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryNumTest
{
    @Test
    public void testGenerateBinaryNumbers() {
        ArrayList<String> output = new ArrayList<>(Arrays.asList("1 10 11 100 101"));
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("1a 10 11 100 101"));

        BinaryNum.generateBinaryNumbers(5);
        Assertions.assertEquals(expectedResult, output);
    }
}
