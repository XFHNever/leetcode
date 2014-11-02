package math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by never on 2014/11/2.
 */
public class ATOITest {
    @Test
    public void test1() {
        ATOI atoi = new ATOI();
        String str = "  abc123qqq";
        assertEquals(123, atoi.atoi(str));
    }

    @Test
    public void test2() {
        ATOI atoi = new ATOI();
        String str = "  abc-123qqq";
        assertEquals(-123, atoi.atoi(str));
    }

    @Test
    public void test3() {
        ATOI atoi = new ATOI();
        String str = "  abc21474836474qqq";
        assertEquals(Integer.MAX_VALUE, atoi.atoi(str));
    }
}
