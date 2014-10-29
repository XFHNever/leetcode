package linkedlist;

/**
 * Created by never on 2014/10/30.
 */
public class ReverseList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode slowPre = null, fastPre = null, slow = head, fast = head;

        while (slow!= null && m>1) {
            m--;
            slowPre = slow;
            slow = slow.next;
        }
        while (fast!= null && n>0) {
            n--;
            fastPre = fast;
            fast = fast.next;
        }

        if (m==n) {
            return head;
        } else {
            if (slowPre == null) {
                fastPre.next = null;
                ListNode left = reverse(head);
                ListNode current = left;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = fast;
                return left;
            } else {
                fastPre.next = null;
                ListNode center = reverse(slow);
                slowPre.next = center;
                while (center.next != null) {
                    center = center.next;
                }
                center.next = fast;
                return head;
            }
        }

    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
