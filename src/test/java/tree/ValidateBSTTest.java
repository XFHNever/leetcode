package tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fuxie on 2014/10/30  16:49.
 */
public class ValidateBSTTest {
    @Test
    public void testIsValidate() {
        ValidateBST validateBST = new ValidateBST();

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode root = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6  = new TreeNode(6);

        root.left = node2;
        root.right = node5;
        node2.left = node1;
        node5.left = node4;
        node5.right = node6;

        assertEquals(true, validateBST.isValidBST(root));
    }
    @Test
    public void testIsValidateWithError() {
        ValidateBST validateBST = new ValidateBST();

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode root = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6  = new TreeNode(3);

        root.left = node2;
        root.right = node5;
        node2.left = node1;
        node5.left = node4;
        node5.right = node6;

        assertEquals(false, validateBST.isValidBST(root));
    }
}
