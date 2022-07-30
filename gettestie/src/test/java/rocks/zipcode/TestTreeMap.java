package rocks.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    @Test
    public void testTreeMap() {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(5, 5);
        map.put(3, 3);
        map.put(4, 4);

        Integer expected = 3;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            Assert.assertEquals(expected++, e.getValue());
        }
    }
}
