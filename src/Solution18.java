/**
 * 二叉树的镜像
 *
 * @author 何宇寰
 */
public class Solution18 {
    public void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}