/**
 * 树的子结构
 *
 * @author 何宇寰
 */
public class Solution17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean res = false;
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            res = equals(root1, root2);
        }
        if (!res) {
            res = equals(root1.left, root2);
        }
        if (!res) {
            res = equals(root1.right, root2);
        }
        return res;
    }

    private boolean equals(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return equals(root1.left, root2.left) && equals(root1.right, root2.right);
    }
}