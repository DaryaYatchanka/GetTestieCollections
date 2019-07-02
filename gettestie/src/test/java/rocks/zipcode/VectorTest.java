package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    @Test
    public void VectorTest1(){
        Vector<Integer> v = new Vector<>();

        v.add(400);
        v.add(300);
        v.add(12);
        v.add(67);

        Integer expected  = 2;
        Integer actual = v.indexOf(12);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void VectorTest2(){
        Vector<Integer> v = new Vector<>();

        v.add(400);
        v.add(300);
        v.add(12);
        v.add(67);
        v.clear();

        Integer expected  = 0;
        Integer actual = v.size();

        Assert.assertEquals(expected, actual);

    }
}
