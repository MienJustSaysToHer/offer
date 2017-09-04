import java.util.Stack;

/**
 * 栈的压入、弹出序列
 *
 * @author 何宇寰
 */
public class Solution21 {
    private Stack<Integer> data = new Stack<>();

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        for (int i = 0, j = 0; i < pushA.length; i++) {
            data.push(pushA[i]);
            while (!data.isEmpty() && j < popA.length && popA[j] == data.peek()) {
                data.pop();
                j++;
            }
        }
        return data.isEmpty();
    }
}