package linkedlist;

/**
 * Created by never on 2014/10/29.
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int n) {
        if (n<=0)
             return head;

        if (head == null || head.next == null)
            return head;

        ListNode slow = head, fast = head;
        while (fast != null && n>0) {
            fast = fast.next;
            n--;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (slow != head) {
            fast.next = head;
            ListNode newHead = slow.next;
            slow.next = null;
            return newHead;
        } else {
            return head;
        }

    }
}
