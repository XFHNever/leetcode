package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fuxie on 2014/10/27  12:57.
 */
public class MaxPSubArrayTest {
    @Test
    public void testMaxProduct() {
        MaxPSubArray maxPSubArray = new MaxPSubArray();

        int[] A = {2, 3, -2, 4};
        assertEquals(6, maxPSubArray.maxProduct(A));
    }
    @Test
    public void testMaxProductContainZero() {
        MaxPSubArray maxPSubArray = new MaxPSubArray();

        int[] A = {2, 3, -2, 4, 0, -2, -4};
        assertEquals(8, maxPSubArray.maxProduct(A));
    }
    @Test
    public void testMaxProductContainSingle() {
        MaxPSubArray maxPSubArray = new MaxPSubArray();

        int[] A = { -4};
        assertEquals(-4, maxPSubArray.maxProduct(A));
    }
}
