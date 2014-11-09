package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by never on 2014/11/7.
 */
public class SingleNumber2Test {
    @Test
    public void test() {
        SingleNumber2 singleNumber2 = new SingleNumber2();
        int[] array = {1, 2, 3, 4, 5, 4, 5, 1, 2, 1, 2, 4, 5};
        assertEquals(3, singleNumber2.singleNumber3(array));
    }
}
