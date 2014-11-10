package stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fuxie on 2014/11/10  15:22.
 */
public class MinStackTest {
    MinStack stack ;
    @Before
    public void setup() {
        stack = new MinStack();
        stack.push(5);
        stack.push(1);
        stack.push(3);
    }

    @Test
    public void testPush() {
        stack.push(4);
        assertEquals(4, stack.top());
    }



    @Test
    public void testPop() {
        stack.pop();
        assertEquals(1, stack.top());
    }
    @Test
    public void testTop() {
        assertEquals(3, stack.top());
    }
    @Test
    public void testGetMin() {
        assertEquals(1, stack.getMin());
    }

}
