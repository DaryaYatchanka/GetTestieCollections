package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void TreeMapTest1() {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(5, "table");
        tm.put(7, "pillow");
        tm.put(3, "mirror");
        tm.put(10, "chair");


        Integer expected = 3;
        Integer actual = tm.firstKey();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void TreeMapTest(){
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(5, "table");
        tm.put(7, "pillow");
        tm.put(3, "mirror");
        tm.put(10, "chair");

       Integer expected = 5;
       Integer actual = tm.higherKey(4);

       Assert.assertEquals(expected, actual);
    }
}
