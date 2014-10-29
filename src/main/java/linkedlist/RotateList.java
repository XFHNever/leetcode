package linkedlist;

/**
 * Created by never on 2014/10/29.
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int n) {
        if (n<=0 || head == null || head.next == null)
            return head;

        int length = 0;
        ListNode temp = head;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        n = n % length;
        if (n == length) {
            return head;
        }

        ListNode slow = head, fast = head;
        while (fast != null && n>0) {
            fast = fast.next;
            n--;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = head;
        ListNode newHead = slow.next;
        slow.next = null;
        return newHead;
    }
}
