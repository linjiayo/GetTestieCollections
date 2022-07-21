package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    Stack<String> stack;

    @org.junit.Before
    public void setUp() throws Exception {
        stack = new Stack<>();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStack2() {
        stack.push("Hello world");
        String actual = stack.pop();
        assertEquals("Hello world", actual);
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void TestStack() {
        stack.push("Hello world");
        String actual = stack.peek();
        assertEquals("Hello world", actual);
    }


    // Make a bigger test exercising more Stack methods.....
}
