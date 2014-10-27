package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fuxie on 2014/10/27  15:22.
 */
public class TwoSumTest {
    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] array = {2, 7, 11, 15};

        int[] result = twoSum.twoSum(array, 9);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }
}
