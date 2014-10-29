package linkedlist;

/**
 * Created by never on 2014/10/28.
 */
public class ConvertBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }

        ListNode fast = head,
                 slow = head,
                 pre = null;
        while (fast!=null && fast.next!= null && fast.next.next!=null) {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }

        TreeNode root = new TreeNode(slow.val);
        if (slow.next != null) {
            root.right = sortedListToBST(slow.next);
        }

        if (pre != null) {
            pre.next = null;
            root.left = sortedListToBST(head);
        }

        return root;
    }
}
