package Queue_Interface.Reverse_Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest
{
    @Test
    public void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10,20,30));
        Queue<Integer> expectedQueue = new LinkedList<>(Arrays.asList(30,20,10));

        Reverse.reverseQueue(queue);
        Assertions.assertEquals(expectedQueue, queue);
    }
}
