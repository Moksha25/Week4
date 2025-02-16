package JUnit.Basic_JUnit.Testing_List_Operations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest
{
    ListManager listManager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 5);
        listManager.addElement(list, 10);
        assertEquals(2, list.size());
        assertTrue(list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(5); // Duplicate value to check correct removal

        listManager.removeElement(list, 5);
        assertEquals(2, list.size()); // Only first occurrence should be removed
        assertTrue(list.contains(5)); // One "5" should still exist
        assertTrue(list.contains(10));

        listManager.removeElement(list, 5);
        assertFalse(list.contains(5)); // All "5" removed
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, listManager.getSize(list));

        listManager.addElement(list, 7);
        listManager.addElement(list, 14);
        assertEquals(2, listManager.getSize(list));

        listManager.removeElement(list, 7);
        assertEquals(1, listManager.getSize(list));

        list.clear();
        assertEquals(0, listManager.getSize(list));
    }

    @Test
    void testNullListOperations() {
        assertEquals(0, listManager.getSize(null)); // Null list should return size 0

        // Ensure methods do not throw exceptions
        listManager.addElement(null, 5);
        listManager.removeElement(null, 5);
    }
}
