package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestStack2(){
        Stack<String> stack = new Stack<>();
        stack.push("Hey");
        String expected = "Hey";
        String actual =stack.peek();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void TestStack3(){
        Stack<String> stack = new Stack();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("b");

        int expected = 2;
        int actual =stack.search("c");

        Assert.assertEquals(expected, actual);
    }
}
