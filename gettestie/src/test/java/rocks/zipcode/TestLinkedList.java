package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    LinkedList<String> list;

    @Before
    public void init() {
        list = new LinkedList<>();
    }

    @Test
    public void testLinkedList() {
        String expected = "hello";

        list.add(expected);

        String actual = list.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLinkedListRemove() {
        String s = "hello";
        String expected = "world";
        list.add(s);
        list.add(expected);

        list.removeFirst();
        String actual = list.pop();

        Assert.assertEquals(expected, actual);
        Assert.assertTrue(list.isEmpty());

    }
}
