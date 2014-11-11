package graph;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by fuxie on 2014/11/11  9:09.
 */
public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null)
            return null;
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        UndirectedGraphNode head = new UndirectedGraphNode(node.label);
        map.put(node, head);
        DFS(map, node);

        return head;
    }

    private void DFS(HashMap<UndirectedGraphNode, UndirectedGraphNode> map, UndirectedGraphNode node) {
        if (node == null)
            return;

        for (UndirectedGraphNode n : node.neighbors) {
            if (!map.containsKey(n)) {
                UndirectedGraphNode newNeighbor = new UndirectedGraphNode(n.label);
                map.put(n, newNeighbor);
                DFS(map, n);
            }
            map.get(node).neighbors.add(map.get(n));
        }
    }

    public UndirectedGraphNode cloneGraph2(UndirectedGraphNode node) {
        if (node == null)
            return null;
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();

        UndirectedGraphNode head = new UndirectedGraphNode(node.label);
        map.put(node, head);
        queue.add(node);

        while (!queue.isEmpty()) {
            UndirectedGraphNode currentNode = queue.poll();
            for (UndirectedGraphNode n : currentNode.neighbors) {
                if (!map.containsKey(n)) {
                    UndirectedGraphNode newNeighbor = new UndirectedGraphNode(n.label);
                    map.put(n, newNeighbor);
                    queue.add(n);
                }

                map.get(currentNode).neighbors.add(map.get(n));
            }
        }

        return head;
    }
}
