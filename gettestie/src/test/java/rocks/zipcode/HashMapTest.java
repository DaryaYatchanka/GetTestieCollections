package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

    @Test
    public void HashMapTest1() {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "blouse");
        hm.put(2, "pans");
        hm.put(3, "jeans");

        hm.remove(2);

        Integer expected = 2;
        Integer actual = hm.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void HashMapTest2() {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "blouse");
        hm.put(2, "pans");
        hm.put(3, "jeans");

        hm.replace(2, "pans", "skirt");

        boolean actual = hm.containsValue("skirt");

        Assert.assertTrue(actual);

    }

    @Test
    public void HashMapTest3(){
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put( "blouse", 99);
        hm.put( "pans", 89);
        hm.put( "jeans", 23);

        Set set = hm.entrySet();


        for(Map.Entry<String, Integer> x: hm.entrySet()){
            hm.replace(x.getKey(), x.getValue(), x.getValue()+10);

        }

        boolean expected = hm.containsValue(109);

        Assert.assertTrue(expected);
    }
}
