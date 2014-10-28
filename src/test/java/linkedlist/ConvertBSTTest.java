package linkedlist;

import org.junit.Test;

/**
 * Created by never on 2014/10/28.
 */
public class ConvertBSTTest {
    @Test
    public void test() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ConvertBST convertBST = new ConvertBST();
        convertBST.sortedListToBST(l1);
    }
}
