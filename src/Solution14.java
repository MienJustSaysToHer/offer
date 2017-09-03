/**
 * 链表中倒数第k个结点
 *
 * @author 何宇寰
 */
public class Solution14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        for (int i = 0; i < k; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        while (head != null) {
            head = head.next;
            p = p.next;
        }
        return p;
    }
}