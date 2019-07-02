package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void TreeSetTest() {
        Set<String> ts = new TreeSet<>();
        ts.add("Dasha");
        ts.add("Eugene");
        ts.add("Caleb");

        Object[] expected = {"Caleb", "Dasha", "Eugene"};
        Object[] actual = ts.toArray();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void TreeSetTest2() {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(4);
        ts.add(6);
        ts.add(100);
        ts.add(3);
        ts.add(98);

       Integer expected = 100;
       Integer actual  =  ts.last();

       Assert.assertEquals(expected, actual);

    }
}
