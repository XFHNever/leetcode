package linkedlist;

import java.util.HashMap;

/**
 * Created by never on 2014/11/7.
 */
public class DCopyRandomList {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return null;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode newHead = new RandomListNode(head.label);

        RandomListNode current=newHead;
        map.put(head, newHead);


        while (head != null) {
            if (head.next != null) {
                RandomListNode node = map.get(head.next);
                if (node != null) {
                    current.next = node;
                } else {
                    current.next = new RandomListNode(head.next.label);
                    map.put(head.next, current.next);
                }
            }

            if (head.random != null) {
                RandomListNode node = map.get(head.random);
                if (node != null) {
                    current.random = node;
                } else {
                    current.random = new RandomListNode(head.random.label);
                    map.put(head.random, current.random);
                }
            }
            current = current.next;
            head = head.next;
        }

        return newHead;
    }
}
