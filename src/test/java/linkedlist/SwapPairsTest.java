package linkedlist;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by never on 2014/10/28.
 */
public class SwapPairsTest {
    @Test
    public void test() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        SwapPairs swapPairs = new SwapPairs();
        ListNode result = swapPairs.swapPairs(l1);
        assertEquals(4, result.val);
        assertEquals(2, result.next.val);
        assertEquals(5, result.next.next.val);
    }
}
