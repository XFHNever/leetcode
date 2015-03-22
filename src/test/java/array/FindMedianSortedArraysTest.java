package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xiefuheng on 15/3/3.
 */
public class FindMedianSortedArraysTest {
    @Test
    public void test() {
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {1, 2, 3, 4};
     //   assertEquals(3.0, findMedianSortedArrays.findMedianSortedArrays(a, b), 0.1);
     //   assertEquals(1, findMedianSortedArrays.findMedianSortedArrays(new int[]{}, new int[]{1}), 0.1);
        assertEquals(100000.5, findMedianSortedArrays.findMedianSortedArrays(new int[]{100000}, new int[]{100001}), 0.1);
    }
}
