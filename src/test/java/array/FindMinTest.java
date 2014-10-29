package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fuxie on 2014/10/27  15:47.
 */
public class FindMinTest {
    @Test
    public void testFindMin() {
        FindMin findMin = new FindMin();
        int[] array = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, findMin.findMin2(array));
    }
}
