/**
 * 重建二叉树
 *
 * @author 何宇寰
 */
public class Solution4 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    TreeNode reConstructBinaryTree(int[] pre, int prestart, int preend, int[] in, int instart, int inend) {
        if (prestart > preend || instart > inend) {
            return null;
        }
        TreeNode treeNode = new TreeNode(pre[prestart]);
        for (int i = instart; i <= inend; i++) {
            if (pre[prestart] == in[i]) {
                treeNode.left = reConstructBinaryTree(pre, prestart + 1, prestart + i - instart, in, instart, i - 1);
                treeNode.right = reConstructBinaryTree(pre, prestart + i - instart + 1, preend, in, i + 1, inend);
            }
        }
        return treeNode;
    }
}