package linkedlist;

/**
 * Created by never on 2014/10/30.
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        reorder(head);
    }

    public ListNode reorder(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return  head;

        ListNode tail = head, pre = null, temp = null;
        while (tail.next != null) {
            pre = tail;
            tail = tail.next;
        }

        temp = head.next;
        pre.next = null;
        head.next = tail;
        tail.next = reorder(temp);

        return head;
    }

    public ListNode reorder2(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return  head;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode reverseNode = reverse(slow.next);
        slow.next = null;

        ListNode temp, current = head;
        while (current != null && reverseNode != null) {
            temp = current.next;
            current.next = reverseNode;
            reverseNode = reverseNode.next;
            current.next.next = temp;
            current = temp;
        }

        while (reverseNode != null) {
            current.next = reverseNode;
            current = reverseNode;
            reverseNode = reverseNode.next;
        }

        return head;
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
