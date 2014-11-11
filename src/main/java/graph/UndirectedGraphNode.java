package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fuxie on 2014/11/11  9:10.
 */
public class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }

    void print() {
        while (this!=null) {
            System.out.print(label + ",");
            for (int i=0; i<neighbors.size(); i++) {
                System.out.print(neighbors.get(0).label + ",");
            }
            System.out.print( "#");
        }
    }
}
