package Queue_Interface.Hospital_Triage_System;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HospitalTest
{
    @Test
    public void testTriageOrder()
    {
        PriorityQueue<Hospital.Patient> queue = new PriorityQueue<>((a, b) -> b.severity - a.severity);

        queue.add(new Hospital.Patient("John", 3));
        queue.add(new Hospital.Patient("Alice", 5));
        queue.add(new Hospital.Patient("Bob", 2));

        String[] expectedOrder = {"Alice", "John", "Bob"};
        String[] actualOrder = new String[3];

        for (int i = 0; i < 3; i++)
        {
            actualOrder[i] = queue.poll().name;
        }

        assertArrayEquals(expectedOrder, actualOrder);
    }
}
