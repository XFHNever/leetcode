package linkedlist;

/**
 * Created by never on 2014/10/28.
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode right = mergeSort(slow.next);
        slow.next = null;
        ListNode left = mergeSort(head);

        return merge(left, right);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode result = null, pre = null, current;
        while (l1 != null && l2 != null) {
            current = (l1.val>l2.val)? l2 : l1;
            if (result == null) {
                result = current;
                pre = current;
            } else {
                pre.next = current;
                pre = current;
            }
            if (current == l1) {
                l1 = l1.next;
            }
            if (current == l2) {
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            if (result == null) {
                result = l1;
                pre = l1;
            } else {
                pre.next = l1;
                pre = l1;
            }
            l1 = l1.next;
        }

        while (l2 != null) {
            if (result == null) {
                result = l2;
                pre = l2;
            } else {
                pre.next = l2;
                pre = l2;
            }
            l2 = l2.next;
        }

        return result;
    }
}
