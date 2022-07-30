package rocks.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

    @Test
    public void testIterator() {
        List<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));

        Integer expected = 0;
        Iterator<Integer> iter = arr.iterator();

        while (iter.hasNext()) {
            Assert.assertEquals(expected++, iter.next());
        }
    }
}
