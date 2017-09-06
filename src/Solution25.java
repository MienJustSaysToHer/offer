/**
 * 复杂链表的复制
 *
 * @author 何宇寰
 */
public class Solution25 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode dummy = pHead;
        while (pHead != null) {
            RandomListNode next = new RandomListNode(pHead.label);
            next.next = pHead.next;
            pHead.next = next;
            pHead = next.next;
        }
        pHead = dummy;
        while (pHead != null) {
            if (pHead.random != null) {
                pHead.next.random = pHead.random.next;
            }
            pHead = pHead.next.next;
        }

        RandomListNode pHead1 = dummy;
        RandomListNode pHead2 = dummy.next;
        dummy = pHead2;
        while (pHead1 != null) {
            pHead1.next = pHead2.next;
            if (pHead1.next != null)
                pHead2.next = pHead1.next.next;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return dummy;
    }
}