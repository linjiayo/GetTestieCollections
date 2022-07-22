package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayDeque;

public class TestArrayDeque {
    ArrayDeque<String> deque;


    @Test
    public void testArrayDeque() {
        deque = new ArrayDeque<>();
        String expected = "Hello";
        String s2 = "World";

        deque.push(expected);
        String actual = deque.pop();

        Assert.assertEquals(expected, actual);

        deque.push(s2);
        deque.addFirst(expected);

        String actual2 = deque.pollLast();

        Assert.assertEquals(s2, actual2);
    }
}
