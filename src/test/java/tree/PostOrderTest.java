package tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by never on 2014/11/3.
 */
public class PostOrderTest {
    @Test
    public void test() {
        PostOrder postOrder = new PostOrder();

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode root = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        root.left = node2;
        root.right = node5;
        node2.left = node1;
        node5.left = node4;
        node5.right = node6;

        List<Integer> list = postOrder.postorderTraversal2(root);
        assertEquals(1, list.get(0).intValue());
    }
}
