package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
    @Test
    public void ArrayDequeTest() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.add(3);
        ad.add(8);
        ad.add(100);
        ad.addFirst(300);

        Integer expected = 300;
        Integer actual = ad.getFirst();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void ArrayDequeTest2() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.add(3);
        ad.add(8);
        ad.add(100);
        ad.addFirst(300);

        ad.pollFirst();

        boolean actual = ad.contains(300);

        Assert.assertFalse(actual);
    }
}
