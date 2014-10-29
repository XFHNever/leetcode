package linkedlist;

/**
 * Created by never on 2014/10/28.
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = null, temp, newHead = head.next;

        while (head != null && head.next!= null) {
            temp = head.next;
            head.next = head.next.next;
            temp.next = head;
            if (pre != null)
                pre.next = temp;
            pre = head;
            head = head.next;
        }

        return newHead;
    }
}
