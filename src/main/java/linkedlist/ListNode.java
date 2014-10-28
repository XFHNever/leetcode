package linkedlist;

/**
 * Created by never on 2014/10/28.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "\t");
            head = head.next;
        }
    }
}
