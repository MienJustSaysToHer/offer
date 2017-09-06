/**
 * 二叉搜索树的后序遍历序列
 *
 * @author 何宇寰
 */
public class Solution23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verifySquenceOfBST(sequence, 0, sequence.length - 1);
    }

    boolean verifySquenceOfBST(int[] sequence, int start, int end) {
        if (start == end) {
            return true;
        }
        int key = sequence[end];
        int i = start;
        for (; i < end; i++) {
            if (sequence[i] > key) {
                break;
            }
        }
        int m = i;
        for (; i < end; i++) {
            if (sequence[i] < key) {
                return false;
            }
        }
        if (m == start || m == end) {
            return verifySquenceOfBST(sequence, start, end - 1);
        } else {
            return verifySquenceOfBST(sequence, start, m - 1) && verifySquenceOfBST(sequence, m, end - 1);
        }
    }
}