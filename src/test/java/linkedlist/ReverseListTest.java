package linkedlist;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by never on 2014/10/29.
 */
public class ReverseListTest {
    @Test
    public void testRotate() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ReverseListK reverseListK = new ReverseListK();
        ListNode result = reverseListK.reverseKGroup(l1, 2);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
    }
    @Test
    public void testRotate2() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        ReverseListK reverseListK = new ReverseListK();
        ListNode result = reverseListK.reverseKGroup(l1, 2);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
    }
}
