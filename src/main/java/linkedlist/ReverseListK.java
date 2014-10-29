package linkedlist;

/**
 * Created by never on 2014/10/29.
 */
public class ReverseListK {
    public ListNode reverseKGroup(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;
        while (temp != null){
            length++;
            temp = temp.next;
        }

        if (k> length || k<=1) {
            return head;
        }

        if (k == length)
            return reverse(head);

        int l = 0;
        ListNode pre = null, current = head;
        while (current != null) {
            if (l == k) {
                pre.next = null;
                ListNode node = reverse(head);
                ListNode tail = node;
                while (tail!= null && tail.next != null)
                    tail = tail.next;

                tail.next = reverseKGroup(current, k);

                return node;
            } else {
                l++;
                pre = current;
                current = current.next;
            }
        }


        return null;
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
