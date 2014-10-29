package linkedlist;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by never on 2014/10/30.
 */
public class ReverseList2Test {
    @Test
    public void testReverse() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ReverseList2 reverseList2 = new ReverseList2();
        ListNode result = reverseList2.reverseBetween(l1, 2, 4);
        assertEquals(1, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
    }

    @Test
    public void testReverse2() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        ReverseList2 reverseList2 = new ReverseList2();
        ListNode result = reverseList2.reverseBetween(l1, 1, 2);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
    }
}
