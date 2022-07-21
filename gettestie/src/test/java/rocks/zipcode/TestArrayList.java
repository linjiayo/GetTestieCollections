package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {
    ArrayList<String> arrayList;

    @Before
    public void init() {
        arrayList = new ArrayList<>();
    }

    @Test
    public void testArrayList() {
        arrayList.add("test");

        Assert.assertEquals(true, arrayList.contains("test"));

        arrayList.remove("test");

        Assert.assertEquals(0, arrayList.size());

        arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");

        Assert.assertEquals("test2", arrayList.get(1));

        arrayList.remove("test2");

        Boolean expected = false;
        Boolean actual = arrayList.contains("test2");

        Assert.assertEquals(expected, actual);
    }
}
