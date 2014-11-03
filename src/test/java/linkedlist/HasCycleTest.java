package linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by never on 2014/11/4.
 */
public class HasCycleTest {
    @Test
    public void testNotCycle() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        HasCycle hasCycle = new HasCycle();
        assertFalse(hasCycle.hasCycle(l1));
    }

    @Test
    public void testHasCycle() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l2;

        HasCycle hasCycle = new HasCycle();
        assertTrue(hasCycle.hasCycle(l1));
    }

}
