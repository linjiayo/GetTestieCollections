package rocks.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestComparable {

    @Test
    public void testComparable() {
        Integer i = 1;
        Integer j = 2;

        Integer actual = j.compareTo(i);

        Assert.assertTrue(actual > 0);
    }
}
