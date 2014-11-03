package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by never on 2014/11/3.
 */
public class PostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<BTNoode> stack = new Stack<BTNoode>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                BTNoode node = new BTNoode(root, true);
                stack.push(node);
                root = root.left;
            }

            if (!stack.isEmpty()) {
                BTNoode node = stack.pop();
                if (node.isFirst) {
                    node.isFirst = false;
                    stack.push(node);
                    root = node.node.right;
                } else {
                    list.add(node.node.val);
                }
            }
        }

        return list;
    }

    class BTNoode {
        TreeNode node;
        boolean isFirst;

        BTNoode(TreeNode node, boolean isFirst) {
            this.node = node;
            this.isFirst = isFirst;
        }
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode preNode = null;

        if (root == null)
            return list;

        stack.push(root);
        while (!stack.isEmpty()) {

            root = stack.peek();

            if ((root.left == null && root.right == null) ||
                    (preNode != null && (preNode == root.left || preNode ==root.right))) {
                list.add(root.val);
                stack.pop();
                preNode = root;
            } else {
                if (root.right != null) {
                    stack.push(root.right);
                }
                if (root.left != null) {
                    stack.push(root.left);
                }
            }
        }

        return list;
    }
}
