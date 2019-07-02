
package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.*;


public class HashSetTest {

    @Test
    public void TestHashSet1() {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(9);
        s.add(10);

        boolean actual = s.add(10);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestHashSet2() {
        Set<Integer> s = new HashSet<>();

        s.add(2);
        s.add(3);
        s.add(100);
        s.add(89);

        Iterator<Integer> itr;
        itr = s.iterator();

        Integer expected = 194;
        Integer actual = 0;

        while (itr.hasNext()) {
            actual = actual + itr.next();
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestHashSet3() {
        Set<Integer> s = new HashSet<>();

        s.add(300);
        s.add(400);

        boolean actual = s.contains(300);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestHashSet4() {
        Set<Integer> s = new HashSet<>();

        s.add(33);
        s.add(45);
        s.add(89);

        s.clear();
        boolean expected = true;
        boolean actual = s.isEmpty();

        Assert.assertEquals(expected, actual);
    }
}


