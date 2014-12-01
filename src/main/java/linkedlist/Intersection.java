package linkedlist;

/**
 * Created by xiefuheng on 14/12/1.
 */
public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = 0, bLength = 0;
        ListNode tem = headA;
        while (tem != null) {
            aLength++;
            tem = tem.next;
        }

        tem = headB;
        while (tem != null) {
            bLength++;
            tem = tem.next;
        }

        int distance = Math.abs(aLength - bLength);

        if (aLength > bLength ) {
            while (distance > 0) {
                headA = headA.next;
                distance--;
            }
        }

        if (aLength < bLength ) {
            while (distance > 0) {
                headB = headB.next;
                distance--;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
