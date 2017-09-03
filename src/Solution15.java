/**
 * 反转链表
 *
 * @author 何宇寰
 */
public class Solution15 {
    public ListNode ReverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}