package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by never on 2014/11/10.
 */
public class CandyTest {
    @Test
    public void test() {
        Candy candy = new Candy();
        int[] array = new int[]{1, 5, 4, 3, 2};
        assertEquals(11, candy.candy2(array));
    }
    @Test
    public void test2() {
        Candy candy = new Candy();
        int[] array = new int[]{4,2,3,4,1};
        assertEquals(9, candy.candy2(array));
    }
}
