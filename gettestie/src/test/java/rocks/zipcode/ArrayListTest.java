package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {

    @Test
    public void TestArrayList1(){
        ArrayList<Integer> al = new ArrayList<>();

      al.add(0, 3);
      al.add(1, 4);
      al.add(2, 5);
      al.add(3,7);

      Integer expected = 4;
      Integer actual =al.get(1);

      Assert.assertEquals(expected, actual);

    }

    @Test
    public void TestArrayList2() {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(0, 3);
        al.add(1, 4);
        al.add(2, 5);
        al.add(3, 7);


        Integer actual =al.lastIndexOf(9);
        Integer expected = -1;

        Assert.assertEquals(expected, actual);

    }
}
