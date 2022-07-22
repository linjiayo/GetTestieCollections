package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    Map<String, Integer> hashMap;

    @Before
    public void init() {
        hashMap = new HashMap<>();
    }

    @Test
    public void testMap() {
        Integer expected = 1;
        hashMap.put("A", expected);

        Integer actual = hashMap.get("A");
        Integer actualSize = hashMap.size();
        Assert.assertEquals(expected, actual);

        Assert.assertEquals(expected, actualSize);
    }
    @Test
    public void testMapRemove() {
        hashMap.put("A", 1);
        Integer expectedSize = 0;

        hashMap.remove("A");
        Integer actualSize = hashMap.size();

        Assert.assertEquals(expectedSize, actualSize);
    }
}
