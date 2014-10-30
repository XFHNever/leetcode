package tree;

/**
 * Created by fuxie on 2014/10/30  16:49.
 */
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValid(TreeNode root, int min, int max) {
        if (root == null)
            return true;

        boolean leftValid = true, rightValid = true;

        if (root.val > min && root.val < max) {
            if (root.left != null)
                leftValid = (root.val > root.left.val)&&isValid(root.left, min, Math.min(max,root.val));
            if (root.right != null)
                rightValid = (root.val < root.right.val)&&isValid(root.right, Math.max(min, root.val), max);

            return leftValid&&rightValid;
        } else {
            return false;
        }

    }
}
