package Queue_Interface.Circular_Buffer_Simulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BufferTest
{
    @Test
    void testCircularBuffer()
    {
        Buffer b = new Buffer(3);

        b.enqueue(1);
        b.enqueue(2);
        b.enqueue(3);

        Assertions.assertEquals(1, b.dequeue());
        Assertions.assertEquals(2, b.dequeue());
        Assertions.assertEquals(3, b.dequeue());
    }
}
