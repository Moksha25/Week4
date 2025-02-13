package List_Interface.Rotate_Elements_in_List;

import List_Interface.Rotate_Elements_in_List.Rotate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateTest
{
    @Test
    void testRotate()
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int position = 2;
        List<Integer> expectedRotation = new ArrayList<>(Arrays.asList(30,40,50,10,20));

        List<Integer> rotation = Rotate.rotateElement(list, position);
        Assertions.assertArrayEquals(expectedRotation.toArray(), rotation.toArray());
    }
}
