package linkedlist;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by never on 2014/10/30.
 */
public class ReorderListTest {
    @Test
    public void testRotate() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ReorderList reorderList = new ReorderList();
        ListNode result = reorderList.reorder(l1);
        assertEquals(1, result.val);
        assertEquals(5, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertEquals(3, result.next.next.next.next.val);
    }
}
