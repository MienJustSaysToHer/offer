import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 从上往下打印二叉树
 *
 * @author 何宇寰
 */
public class Solution22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            int l = list.size();
            for (int i = 0; i < l; i++) {
                TreeNode node = list.remove();
                res.add(node.val);
                if (node.left != null) {
                    list.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right);
                }
            }
        }
        return res;
    }
}