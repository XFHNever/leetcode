package linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xiefuheng on 14/12/1.
 */
public class IntersectionTest {
    @Test
    public void test() {
        Intersection intersection = new Intersection();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l3;
        l3.next = l4;
        l4.next = l5;
        l2.next = l4;

        ListNode node = intersection.getIntersectionNode(l1, l2);
        assertEquals(4, node.val);
    }
}
