package linkedlist;

/**
 * Created by never on 2014/11/3.
 */
public class InsertSort {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode current = head.next;
        ListNode temp = head, pre = head, tail = head;

        while (current != null) {
            temp = head;
            while (temp != current && current.val >= temp.val) {
                pre = temp;
                temp = temp.next;
            }

            if (temp == head) {
                ListNode n = current.next;
                current.next = head;
                head = current;
                tail.next = n;
                current = n;
            } else if (temp == current) {
                tail = current;
                current = current.next;
            } else {
                pre.next = current;
                ListNode n = current.next;
                current.next = temp;
                tail.next = n;
                current = n;
            }
        }

        return head;
    }
}
