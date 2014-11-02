package stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by never on 2014/11/2.
 */
public class RPNTest {
    @Test
    public void testRPN1() {
        RPN rpn = new RPN();
        String[] array = {"2", "1", "+", "3", "*"};
        assertEquals(9, rpn.evalRPN(array));
    }
    @Test
    public void testRPN2() {
        RPN rpn = new RPN();
        String[] array = {"4", "13", "5", "/", "+"};
        assertEquals(6, rpn.evalRPN(array));
    }
}
