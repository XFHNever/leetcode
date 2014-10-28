package linkedlist;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by never on 2014/10/28.
 */
public class AddTwoListTest {
    @Test
    public void testAdd() {
        AddTwoList addTwoList = new AddTwoList();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoList.addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }
}
