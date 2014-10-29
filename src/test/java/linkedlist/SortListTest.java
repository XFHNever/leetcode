package linkedlist;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by never on 2014/10/28.
 */
public class SortListTest {
    @Test
    public void test() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(7);
        l1.next.next.next = new ListNode(5);
        SortList sortList = new SortList();
        ListNode result = sortList.sortList(l1);
        assertEquals(2, result.val);
        assertEquals(4, result.next.val);
        assertEquals(5, result.next.next.val);
        assertEquals(7, result.next.next.next.val);
    }
}
