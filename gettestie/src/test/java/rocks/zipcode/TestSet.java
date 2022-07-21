package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    Set<String> set;


    @Before
    public void init() {
        set = new HashSet<>();
    }

    @Test
    public void testSet1() {
        set.add("Test");
        Assert.assertEquals(false, set.isEmpty());
    }

    @Test
    public void testSetGet() {
        set.add("Test");

        Boolean contains = set.contains("Test");

        Assert.assertEquals(true, contains);
    }

    @Test
    public void testIsEmpty() {
        set.add("test");

        Boolean expected = false;

        Assert.assertEquals(expected, set.isEmpty());
    }
}
