package Queue_Interface.Implement_Stack_Using_Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class ImplimentationTest
{
    @Test
    void testImplimentation()
    {
        Implimentation stack = new Implimentation();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.pop());
    }
}
