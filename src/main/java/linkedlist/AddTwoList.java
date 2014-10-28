package linkedlist;

/**
 * Created by never on 2014/10/28.
 */
public class AddTwoList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        ListNode head = null,
                 current, pre = null;
        int add = 0;

        while (l1 != null && l2 != null) {
            current = new ListNode((l1.val+l2.val+add)%10);
            add = (l1.val+l2.val+add)/10;
            if (head == null) {
                head = current;
                pre = head;
            } else {
                pre.next = current;
                pre = current;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            current = new ListNode((l1.val+add)%10);
            add = (l1.val+add)/10;

            if (head == null) {
                head = current;
                pre = head;
            } else {
                pre.next = current;
                pre = current;
            }
            l1 = l1.next;
        }

        while (l2 != null) {
            current = new ListNode((l2.val+add)%10);
            add = (l2.val+add)/10;
            if (head == null) {
                head = current;
                pre = head;
            } else {
                pre.next = current;
                pre = current;
            }
            l2 = l2.next;
        }
        if (add > 0) {
            pre.next = new ListNode(add);
        }

        return head;

    }
}
