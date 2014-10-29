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
}
