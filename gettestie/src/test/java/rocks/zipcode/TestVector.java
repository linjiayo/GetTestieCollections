package rocks.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Vector;

public class TestVector {
    Vector<String> vector;


    @Test
    public void testVector() {
        vector = new Vector<>();
        String expected = "test";
        vector.add(expected);

        Boolean actualContains = vector.contains(expected);
        String actual = vector.firstElement();

        Assert.assertEquals(expected, actual);
        Assert.assertTrue(actualContains);
    }
}
