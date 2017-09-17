/**
 * 二叉搜索树与双向链表
 *
 * @author 何宇寰
 */
public class Solution26 {
    TreeNode p;
    TreeNode dummy;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        Convert(pRootOfTree.left);
        if (dummy == null) {
            p = pRootOfTree;
            dummy = pRootOfTree;
        } else {
            pRootOfTree.left = p;
            p.right = pRootOfTree;
            p = pRootOfTree;
        }
        Convert(pRootOfTree.right);
        return dummy;
    }
}