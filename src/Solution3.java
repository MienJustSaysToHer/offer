import java.util.ArrayList;

/**
 * 从尾到头打印链表
 *
 * @author 何宇寰
 */
public class Solution3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        if (listNode != null) {
            helper(result, listNode);
        }
        return result;
    }

    void helper(ArrayList<Integer> result, ListNode listNode) {
        if (listNode.next != null) {
            helper(result, listNode.next);
        }
        result.add(listNode.val);
    }
}