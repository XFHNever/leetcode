package linkedlist;

/**
 * Created by never on 2014/11/4.
 */
public class CycleIndex {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                break;
        }

        if (fast.next == null || fast.next.next == null) {
            return null;
        }

        slow = head;
        while (fast.next != null) {
            if (fast == slow)
                return fast;
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}
