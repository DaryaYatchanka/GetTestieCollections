package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void LinkedListTest1() {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(300);

        Integer expected = 300;
        Integer actual = ll.getFirst();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void LinkedListTest2() {
        LinkedList<String> ll = new LinkedList<>();

        ll.addFirst("300");
        ll.peekFirst();

        Integer expected= 1;
        Integer actual =ll.size();


Assert.assertEquals(expected, actual);

    }
}
