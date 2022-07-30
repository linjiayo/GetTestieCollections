package rocks.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

public class TestTreeSet {

    @Test
    public void testTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(4);
        set.add(5);
        set.add(1);

        Integer expected = 1;

        Integer actual = set.first();

        Assert.assertEquals(expected, actual);
    }
}
