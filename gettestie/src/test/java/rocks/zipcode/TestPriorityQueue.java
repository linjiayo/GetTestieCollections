package rocks.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {

    @Test
    public void testPriorityQueue() {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.offer(3);
        q.offer(4);
        q.offer(2);

        for (Integer i = 2; i < 5; i++) {
            Assert.assertEquals(i, q.poll());
        }
    }
}
